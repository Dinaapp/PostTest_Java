Program Sistem Manajemen Top Up Game

Nama: Rizky Wahyu Dina Putri
NIM: 2409116111

Deskripsi Program:
Sebuah program CRUD sederhana untuk mengelola sistem Top Up Game dengan menggunakan bahasa Java. Menerapkan ArrayList, Percabangan, dan perulangan.

Penjelasan Kode:

<img width="773" height="84" alt="image" src="https://github.com/user-attachments/assets/21aa03f9-56ab-45f3-929d-49f15437a8e1" />

Import ArrayList untuk menyimpan daftar nama game, dan import Scanner untuk membaca input dari pengguna. 

<img width="791" height="157" alt="image" src="https://github.com/user-attachments/assets/4142120e-ce26-4ba7-bf83-565a13a75cb3" />

Terdapat beberapa ArrayList, ArrayList daftarGame digunakan untuk menyimpan nama game dan ArrayList topUp digunakan untuk menyimpan variasi top up pada masing-masing game. 

<img width="735" height="753" alt="image" src="https://github.com/user-attachments/assets/710d5f82-f0aa-4103-97e0-c265559934f4" /> 

Membuat data awal untuk daftar game dengan menggunakan method add(). Pada setiap game, dibuat variabel ArrayList baru untuk menampung daftar top-up, lalu nama variabel disingkat seperti ml untuk Mobile Legends, gi untuk Genshin Impact, dan game seterusnya agar lebih ringkas dan mudah dipanggil di dalam program. Kemudian setiap game memiliki daftar top up yang dimasukkan ke dalam topUp menggunakan topUp.add(), yang berfungsi saat daftar game ditampilkan, masing-masing game memiliki daftar top up sesuai dengan urutannya.

<img width="1163" height="354" alt="image" src="https://github.com/user-attachments/assets/fee491d9-1118-4ff9-92a0-5515c594a057" /> 

Menu utama menggunakan perulangan dan membaca input dari pengguna yang disimpan di variabel pilihan. Pengguna akan diberi pilihan untuk melihat daftar game, tambah game atau top up, ubah, dan hapus. Perulangan do-while akan terus mengulang sampai kondisi terpenuhi atau pengguna memilih != 6 untuk keluar dari menu. 

<img width="1530" height="427" alt="image" src="https://github.com/user-attachments/assets/f90e64bd-929a-45bc-bf31-3061b18910cc" /> 



