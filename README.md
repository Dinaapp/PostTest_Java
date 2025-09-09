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

<img width="948" height="252" alt="image" src="https://github.com/user-attachments/assets/8010b283-8786-4903-ae66-dd39f1e490e6" />

Menu utama menggunakan perulangan dan membaca input dari pengguna yang disimpan di variabel pilihan. Pengguna akan diberi pilihan untuk melihat daftar game, tambah game atau top up, ubah, dan hapus. Perulangan do-while akan terus mengulang sampai kondisi terpenuhi atau pengguna memilih != 6 untuk keluar dari menu. 

<img width="1530" height="427" alt="image" src="https://github.com/user-attachments/assets/f90e64bd-929a-45bc-bf31-3061b18910cc" /> 

Setelah menggunakan perulangan untuk tampilan menu, struktur percabangan digunakan untuk pemilihan menu berdasarkan angka yang dimasukkan pengguna. Jika pengguna mengetik angka 1, maka akan masuk ke case 1 atau tampilkan daftar, dan jika memilih angka lain maka program akan memproses untuk masuk ke case yang dituju, dan default digunakan apabila input pengguna tidak sesuai dengan angka yang ada pada menu. 

<img width="1255" height="384" alt="image" src="https://github.com/user-attachments/assets/797d150a-7e2e-423f-a442-c6ea2c0e25db" /> 

<img width="1268" height="669" alt="image" src="https://github.com/user-attachments/assets/2a6f48d7-55b0-45f5-95c2-142b19771c9f" />

Pada Case ke 1, percabangan if-else akan memeriksa apakah daftarGame kosong, jika memiliki isi maka akan menggunakan perulangan for (int i) untuk nama game dan (int j) untuk daftar top up dari game.

<img width="898" height="211" alt="image" src="https://github.com/user-attachments/assets/17785781-426f-46fe-ac99-2b84e0892a54" />

<img width="1508" height="823" alt="image" src="https://github.com/user-attachments/assets/63aa84fa-4311-4908-be0a-6829b77c6bf6" />

Pada Case ke 2, memberikan pilihan untuk pengguna memasukkan data baru ke daftarGame, dengan membaca input pengguna saat memasukkan nama game baru dan menyimpannya di daftarGame sekaligus membuat ArrayList kosong ke topUp agar game yang baru ditambahkan memiliki daftar top up nantinya.

<img width="1173" height="589" alt="image" src="https://github.com/user-attachments/assets/4eed12af-1920-40b3-9e4d-833705cfaea9" />

<img width="1510" height="689" alt="image" src="https://github.com/user-attachments/assets/40c00778-e0eb-4ff8-a917-bcc1a1a33e3d" />

<img width="1449" height="712" alt="image" src="https://github.com/user-attachments/assets/9abcc665-4375-487e-9a3e-26732a2b9513" />

Pada Case ke 3, pengguna dapat menambahkan daftar top up ke game yang baru saja ditambahkan atau game yang telah ada sebelumnya. Menu akan menampilkan daftar game dengan perulangan for. Agar tidak error, menggunakan topUp(pilihGame -1).add(topBaru) berfungsi untuk memngambil daftar top up sesuai index yang dipilih dan menambahkan daftar top up baru ke dalamnya, jadi saat menambahkan daftar baru, hanya index game yang dipilih yang bertambah.

<img width="1066" height="362" alt="image" src="https://github.com/user-attachments/assets/0f1dd6df-fe5a-411f-9fe5-9e58e5e1379a" />

Pada Case ke 4, pengguna memilih game yang ingin diubah. daftarGame.set() digunakan untuk mengganti data lama dengan data baru. Dan akan menampilkan data baru saat pengguna memilih tampilkan daftar game setelah melakukan perubahan.

<img width="978" height="345" alt="image" src="https://github.com/user-attachments/assets/691be67d-28d3-41b5-ad0d-9bb2e6d0ac2c" />

Case ke 5, menu untuk menghapus game menggunakan remove() untuk menghapusnya. Saat menghapus sebuah game, maka daftar top up juga ikut terhapus.

<img width="999" height="312" alt="image" src="https://github.com/user-attachments/assets/685af85a-5ee4-4ad3-adec-21861ca306a1" />


Pada case ke 6, saat pengguna ingin keluar dari program, maka program akan menampilkan pesan singkat, dan program akan berhenti berulang dan Scanner close yang tidak akan membaca input.

