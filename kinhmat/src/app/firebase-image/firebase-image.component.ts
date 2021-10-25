import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {AngularFireStorage} from "@angular/fire/compat/storage";
import {finalize} from "rxjs/operators";

@Component({
  selector: 'app-firebase-image',
  templateUrl: './firebase-image.component.html',
  styleUrls: ['./firebase-image.component.css']
})
export class FirebaseImageComponent implements OnInit {

  ngOnInit(): void {
  }

  title = 'kinhmat';
  selectedFile!: File;
  fb!: string;
  downloadURL!: Observable<string>;

  constructor(private storage: AngularFireStorage) {
  }

  onFileSelected(event: Event) {
    let n = Date.now();
    // @ts-ignore
    const file = event.target.files[0];
    const filePath = `RoomsImages/${n}`;
    const fileRef = this.storage.ref(filePath);
    const task = this.storage.upload(`RoomsImages/${n}`, file);
    task
      .snapshotChanges()
      .pipe(
        finalize(() => {
          this.downloadURL = fileRef.getDownloadURL();
          this.downloadURL.subscribe(url => {
            if (url) {
              this.fb = url;
            }
            console.log(this.fb);
          });
        })
      )
      .subscribe(url => {
        if (url) {
          console.log(url);
        }
      });
  }
}
