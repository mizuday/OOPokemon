# TubesOOP2
Tubes 2 OOP PBO ITB Willy Wangky pake Java

# Technologies
Java SE-1.8

Google gson-2.8.6

# Requirements
<a href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">OracleJDK-1.8</a> (run & build) `belum mendukung OpenJDK`

<a href="https://www.jetbrains.com/idea/download">IntelliJ</a> (build)

# Run
double click run.bat (windows) atau jalankan perintah

#### windows
`$ java -jar .\bin\OOPokemon.jar`

#### Linux dan lainnya
`$ java -jar bin/OOPokemon.jar`


# Build
Pastikan Java JDK 8 (Java SE-1.8) telah di-install

Buka Project Structure pada intelliJ `Ctrl + Shift + Alt + S` 

Pada bagian Project pastikan Project SDK menggunakan Java 1.8 dengan SDK Default 8-Lambdas

![image](https://user-images.githubusercontent.com/68516528/114082730-49982e00-98d8-11eb-9394-41c6544e5c41.png)

Jalankan Build Artifact

![OOPokemon build](https://user-images.githubusercontent.com/68516528/114084156-0ccd3680-98da-11eb-995e-8352c47b6556.gif)

# Tools
#### IntelliJ 
Tidak wajib tapi disarankan

# TO DO LIST:

|   TO DO            | Translate   |   Tambahan         |   Keterangan                                    |
|---                 |---          |---                 |---                                              |
|   Position         | ✅         |                    |                                                 |
|   Element          | ✅         |                    |                                                 |
|   Cell             | ✅         |   GUI              | Inherit dari Rectangle atau ImageView biar bisa di render di GUI   |
|   Map              | ✅         |                    | kontruktornya saja                                  |
|   Engimon          | ✅         |   GUI              | Inherit dari Image atau punya atribut Image biar bisa render gambar di layar  |
|   Turunan Engimon  | ✅         |   GUI              | Tiap Tiap Engimon punya Gambar unik/sama dengan tambahan aura sesuai element     |
|   Skill            | ✅         |   GUI              | Inherit dari Image atau punya atribut image biar bisa render gambar di layar  |
|   Turunan Skill    | ✅         |   GUI              | Tiap Tiap Skill punya Gambar unik/sama dengan tambahan aura sesuai element    |
|   Inventory        | ✅         |   GUI              | Membuat layout dan panel baru   |
|   Occupier         | ✅         |   GUI              |                                                  |
|   ActiveEngimon    | ✅         |   Method           | setImage jika ada Engimon aktif   |
|   Player           | ✅         |   GUI              | atribut Image, setImage dari atribut ini   |
|   Enemy            | ✅         |   Method           | setCenterImage dari Image Engimon      |
|   Breeding         | ✅         |                    | Menunggu semua di atas selesai ditranslasi      |
|   Battle           | ✅         |                    | Menunggu semua di atas selesai ditranslasi      |
|   GameState        | ✅         |                    | Menyimpan semua keterangan game dari map player dan musuh2 |
|   GameState save   | ✅         |                    | Deserialize object gamestate jadi file eksternal seperti json |
|   GameState load   | ✅         |                    | Serialize file eksternal seperti json menjadi object GameState object|   

Progress: ~95% (Kurang penyesuaian dengan spek)

Design Progress : ~90% (Inventory blm dihias)

# Tampilan Layar
![image](https://user-images.githubusercontent.com/68516528/115685206-38dcc300-a382-11eb-8373-0420f8263759.png)

