// Membuat super class KipasAngin
open class KipasAngin() {
    // Membuat atribut levelKecepatan
    var levelKecepatan: Int = 0

    // Membuat method spesifikasi()
    open fun spesifikasi(){

    }
    // Membuat method menyala() yang "akan" return Int pada class turunan dari class KipasAngin
    open fun menyala(): Int?{
        return null
    }
    // Membuat method tambahKecepatan()
    open fun tambahKecepatan(level: Int) {

    }
}

// Membuat class Cosmos yang extends class KipasAngin
class Cosmos(): KipasAngin(){
    // Override isi dari method spesifikasi sesuai spesifikasi kipas Cosmos
    override fun spesifikasi(){
        println("a. Kecepatan 5 Level")
        println("b. Daya 46 Watt")
        println("c. Teknologi Superspread")
        println("d. Ukuran 16 Inch")
        println("e. Garansi 5 Tahun")
    }
    // Override isi dari method menyala dan mengembalikan nilai 46 sebagai daya listrik kipas Cosmos
    override fun menyala(): Int{
        levelKecepatan = 1
        return 46
    }
    // Override isi dari method tambahKecepatan() dan membatasinya hingga level 5
    override fun tambahKecepatan(level: Int){
        if (levelKecepatan + level > 5){
            levelKecepatan = 0
            println("Kipas Angin Mati!")
        } else {
            levelKecepatan += level
        }
    }
}
// Membuat class Miyako yang extends class KipasAngin
class Miyako(): KipasAngin(){
    // Override isi dari method spesifikasi sesuai spesifikasi kipas Miyako
    override fun spesifikasi(){
        println("a. Kecepatan 4 Level")
        println("b. Daya 50 Watt")
        println("c. Teknologi Bearing")
        println("d. Ukuran 16 Inch")
        println("e. Garansi 5 Tahun")
    }
    // Override isi dari method menyala dan mengembalikan nilai 50 sebagai daya listrik kipas Miyako
    override fun menyala(): Int{
        levelKecepatan = 1
        return 50
    }
    // Override isi dari method tambahKecepatan() dan membatasinya hingga level 4
    override fun tambahKecepatan(level: Int){
        if (levelKecepatan + level > 4){
            levelKecepatan = 0
            println("Kipas Angin Mati!")
        } else {
            levelKecepatan += level
        }
    }
}
// Membuat class Panasonic yang extends class KipasAngin
class Panasonic(): KipasAngin(){
    // Override isi dari method spesifikasi sesuai spesifikasi kipas Panasonic
    override fun spesifikasi(){
        println("a. Kecepatan 3 Level")
        println("b. Daya 65 Watt")
        println("c. Teknologi Swing Control")
        println("d. Ukuran 16 Inch")
        println("e. Thermofused motor")
    }
    // Override isi dari method menyala dan mengembalikan nilai 65 sebagai daya listrik kipas Panasonic
    override fun menyala(): Int{
        levelKecepatan = 1
        return 65
    }
    // Override isi dari method tambahKecepatan() dan membatasinya hingga level 3
    override fun tambahKecepatan(level: Int){
        if (levelKecepatan + level > 3){
            levelKecepatan = 0
            println("Kipas Angin Mati!")
        } else {
            levelKecepatan += level
        }
    }
}


