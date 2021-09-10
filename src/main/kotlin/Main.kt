import java.util.*

// Nama: Albertus Adrian Susanto
/*
Soal:
Buatlah sebuah program kipas angin sederhana untuk diimplementasikan sebagai salah satu bagian dari smart home tempat tinggal Efra. Program ini akan meminta user untuk memilih menggunakan kipas angin yang mana ketika sudah sampai di rumah. Ketika user sudah memilih kipas angin, maka program akan menampilkan spesifikasi dan tagihan listrik dari penggunaan kipas angin tersebut sekaligus menambah 1 level kecepatan pada kipas angin. Tagihan listrik hanya dapat dihitung setelah kipas angin sudah menyala. Tagihan listrik diperoleh dari daya dikalikan dengan Rp1.400,00. Kemudian, program ini juga dapat berfungsi untuk menambah kecepatan kipas angin, sesuai dengan batas level kecepatan masing-masing kipas angin. Berikut batas level kecepatan kipas angin yang ada di rumah Efra:
a. Kipas Angin Cosmos - Level kecepatan maksimal 5
b. Kipas Angin Miyako - Level kecepatan maksimal 4
c. Kipas Angin Panasonic - Level kecepatan maksimal 3

Input:
- User memilih kipas angin
- User mengatur level kipas angin,
Keterangan: karena ketika menyala kipas angin sudah memiliki 1 level kecepatan, maka:
- Level kecepatan yang dapat ditambah pada kipas Cosmos maksimal 4
- Level kecepatan yang dapat ditambah pada kipas Miyako maksimal 3
- Level kecepatan yang dapat ditambah pada kipas Panasonic maksimal 2

Output:
- Spesifikasi Kipas Angin
- Tagihan Listrik Kipas Angin
- Kecepatan Kipas Angin
 */

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    // Biaya listrik per kWh
    val biayaListrik = 1400
    println("=== Halo Kak Efra, selamat datang di rumah! ===")
    println("1. Kipas Angin Cosmos")
    println("2. Kipas Angin Miyako")
    println("3. Kipas Angin Panasonic")
    print("Kak Efra ingin menggunakan kipas angin yang mana? [1-3] : ")
    // User input pilihan kipas angin
    var pilih = reader.nextInt()
    if (pilih == 1) {
        println("\n=== Kipas Angin Cosmos ===")
        // Membuat object cosmos dari class Cosmos
        val cosmos = Cosmos()
        println("Spesifikasi:")
        // Memanggil method spesifikasi
        cosmos.spesifikasi()
        // Menghidupkan kipas angin dengan method menyala(), kemudian menampilkan tagihan biaya
        println("\nTotal tagihan listrik untuk Kipas Angin Cosmos: Rp ${biayaListrik*cosmos.menyala()}\n")
        print("Tambah Kecepatan [1-4]: ")
        // User input angka untuk menambah kecepatan kipas angin
        var level = reader.nextInt()
        // Menambah kecepatan kipas angin sesuai input user dengan memanggil method tambahKecepatan()
        cosmos.tambahKecepatan(level)
        // Menampilkan informasi terkait kecepatan kipas angin saat ini dengan memanggil atribut levelKecepatan
        println("Kecepatan kipas angin saat ini: ${cosmos.levelKecepatan}")
    } else if (pilih == 2) {
        println("\n=== Kipas Angin Miyako ===")
        val miyako = Miyako()
        println("Spesifikasi:")
        miyako.spesifikasi()
        println("\nTotal tagihan listrik untuk Kipas Angin Miyako: Rp ${biayaListrik*miyako.menyala()}\n")
        print("Tambah Kecepatan [1-3]: ")
        var level = reader.nextInt()
        miyako.tambahKecepatan(level)
        println("Kecepatan kipas angin saat ini: ${miyako.levelKecepatan}")
    } else if (pilih == 3) {
        println("\n=== Kipas Angin Panasonic ===")
        val panasonic = Panasonic()
        println("Spesifikasi:")
        panasonic.spesifikasi()
        println("\nTotal tagihan listrik untuk Kipas Angin Panasonic: Rp ${biayaListrik*panasonic.menyala()}\n")
        print("Tambah Kecepatan [1-2]: ")
        var level = reader.nextInt()
        panasonic.tambahKecepatan(level)
        println("Kecepatan kipas angin saat ini: ${panasonic.levelKecepatan}")
    } else {
        println("[PERINGATAN] Input Anda salah!")
    }
}