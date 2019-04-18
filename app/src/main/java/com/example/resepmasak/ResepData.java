package com.example.resepmasak;

import com.example.resepmasak.ResepMasak;

import java.util.ArrayList;

public class ResepData {
    public static String[][] data = new String[][]{
            {"Ayam Asam Manis", "Bahan-bahan\t\n" +
                    "Bahan I\n" +
                    "500 gram Daging ayam bagian dada\n" +
                    "1 putih telur\n" +
                    "Tepung bumbu serba guna\n" +
                    "Bumbu Halus\n" +
                    "3 buah cabe merah besar\n" +
                    "5 siung bawang merah\n" +
                    "3 siung bawang putih\n" +
                    "1 cm jahe\n" +
                    "Bahan II\n" +
                    "1/2 siung bawang bombay\n" +
                    "3 buah cabe hijau besar\n" +
                    "1 siung bawang putih\n" +
                    "Saus sambal\n" +
                    "Saus tomat\n" +
                    "Gula\n" +
                    "Garam\n" +
                    "Penyedap rasa\n" +
                    "Langkah\t\n" +
                    "Potong dadu daging ayam, balur dengan putih telur dan tepung serba guna. Goreng hingga kuning keemasan. Sisihkan.\n" +
                    "\n" +
                    "  \n" +
                    "Haluskan bahan bumbu halus\n" +
                    "\n" +
                    "  \n" +
                    "Iris bawang bombay, bawang putih. Iris serong cabe hijau\n" +
                    "\n" +
                    "  \n" +
                    "Tumis bawang bombay, bawang putih, dan cabe hijau hingga layu. Kemudian masukkan bumbu halus.\n" +
                    "\n" +
                    "  \n" +
                    "Tambah 3 sendok makan saus sambal, 2 sdm saos tomat, garam, gula dan penyedap rasa. Tambah sedikit air.\n" +
                    "\n" +
                    "  \n" +
                    "Tumis saus hingga mengental. Jika telah matang dinginkan saus.\n" +
                    "\n" +
                    "  \n" +
                    "Jika saus telah sedikit dingin, campurkan ayam yang telah digoreng pada tahap awal. Sajikan.", "https://img-global.cpcdn.com/003_recipes/9dd350c20b00bb1e/751x532cq70/ayam-asam-manis-masakan-rumahan-sederhana-foto-resep-utama.jpg"},
            {"Mie Ayam", "Bahan-bahan\t\n" +
                    "1 bungkus Mie instan rebus rasa ayam bawang\n" +
                    "1/4 kg ceker ayam\n" +
                    "1/4 kg jamur tiram\n" +
                    "Bumbu halus:5 siung bamer, 4 siung baput, 3 butir kemiri, kunyit\n" +
                    "3 lembr daun salam, daun jeruk\n" +
                    "2 ruas serai geprek\n" +
                    "1 ruas jahe geprek\n" +
                    "1 ruas lenguas geprek\n" +
                    "Irisan daun bawang\n" +
                    "Gula merah, garam, penyedap rasa\n" +
                    "Pelengkap: sawi hijau, acar timun, sambal\n" +
                    "Langkah\t\n" +
                    "Topping jamur tiram+ ceker : rebus ceker&jamur tiram (dipisahin ya ngrebusnya),kalau udah agak mateng angkat & tiriskan.Tumis bumbu halus, tambahkan daun jeruk,daun salam, jahe, serai, lengkuas sampe harum. Setelah itu, masukkan ceker + jamur tiram (disuwir\" atau potong dadu dulu ya),tumis sampe bumbunya meresap.Tambahkan air kaldu dari rebusan ceker secukupnya, bumbui dengan gula,garam,merica, ketumbar bubuk, penyedap rasa, irisan daun bawang. Tuang kecap manis,tunggu sampe kuah agak menyusut\n" +
                    "\n" +
                    "  \n" +
                    "Rebus mie instan rasa ayam(me: mi sukses isi 2), tuang bumbu ke mangkok. Campur mie + bumbu (tanpa kuahnya).\n" +
                    "\n" +
                    "  \n" +
                    "Pelengkap: rebus sawi hijau, irisan timun, sambel rawit\n" +
                    "\n" +
                    "  \n" +
                    "Plating : mie rebus, kasih topping ceker+ jamur, sawi hijau, irisan timun, sambel,saos, kecap. Untuk kuahnya, rebus air beri bawang putih geprek. Siappp santap", "https://img-global.cpcdn.com/003_recipes/306b51b3bbf37e6d/751x532cq70/%F0%9F%8D%9C-mie-ayam-%F0%9F%8D%9D-masakan-rumah-no-micin-foto-resep-utama.jpg"},
            {"Kikil Kuah Pedas", "Bahan-bahan\t\n" +
                    "1 bks kikil (ada 2 gulungan gitu),kurang tau beratnya hehe\n" +
                    "2 bks cumi asin ketengan\n" +
                    "10 cabe merah\n" +
                    "7 cabe rawit\n" +
                    "5 bawang merah\n" +
                    "3 bawang putih\n" +
                    "1 ruas lengkuas\n" +
                    "1 ruas jahe\n" +
                    "1 buah tomat\n" +
                    "1 buah gula merah\n" +
                    "1 sdt garam\n" +
                    "1 sdt penyedap (bisa skip)\n" +
                    "2 lembar daun salam\n" +
                    "2 lembar daun jeruk\n" +
                    "4 gelas belimbing air\n" +
                    "Langkah\t\n" +
                    "Cuci kikil & cumi sbntr,kemudian rendam air panas +/- 15 menit. Potong\" cumi & kikil.\n" +
                    "\n" +
                    "  \n" +
                    "Ulek halus semua bahan,kecuali daun\".geprek jahe & lengkuas (bisa di blender ya,tp kl saya lbh suka d ulek soalnya beda gitu rasanya \uD83D\uDE02apa perasaan aja ya \uD83E\uDD23)\n" +
                    "\n" +
                    "  \n" +
                    "Tumis semua bumbu sampai wangi. Masukka air,masak sampai mendidih,masukkan garam,gula merah,penyedap, setelah larut masukkan kikil & cumi, tunggu sampai air agak berkurang.\n" +
                    "\n" +
                    "  \n" +
                    "Bisa ditaburi bawang goreng ya setelah matang.", "https://img-global.cpcdn.com/003_recipes/0224d16cf15a37ff/751x532cq70/kikil-kuah-pedas-masakan-rumah-sederhana-foto-resep-utama.jpg"},
            {"Tempe", "Bahan-bahan\t\n" +
                    "1/2 kg sayap ayam (cuci bersih)\n" +
                    "1 papan tempe potong-potong tebal\n" +
                    "1 bungkus bango bumbu bacem\n" +
                    "1 bungkus bumbu lima rempah\n" +
                    "1/2 potong gula merah\n" +
                    "Kecap manis\n" +
                    "4 lembar daun salam\n" +
                    "Garam\n" +
                    "Kaldu bubuk\n" +
                    "Air\n" +
                    "Bumbu halus :\n" +
                    "5 siung bawang merah\n" +
                    "5 siung bawang putih\n" +
                    "3 butir kemiri\n" +
                    "1 ruas laos\n" +
                    "Langkah\t\n" +
                    "Tumis bumbu halus hingga harum, masukkan bumbu bacem bango dan bumbu lima rempah, tambahkan garam, kaldu bubuk, gula merah, kecap manis, daun salam dan masukkan air kurang lebih sampai tempe dan ayam terendam\n" +
                    "\n" +
                    "  \n" +
                    "Lalu masukkan ayam dan tempe\n" +
                    "\n" +
                    "  \n" +
                    "Tunggu hingga air menyusut dan warna menjadi coklat, bila warnanya belum pekat, bisa ditambahkan lagi air dan tunggu lagi hingga menyusut\n" +
                    "\n" +
                    "  \n" +
                    "Lalu angkat tempe dan ayam bacem,\n" +
                    "\n" +
                    "  \n" +
                    "Bila ingin di santap bisa di goreng dengan sedikit minyak atau margarin terlebih dahulu agar semakin mantap\n" +
                    "\n" +
                    "  \n" +
                    "Tempe dan ayam bacem siap dinikmati", "https://img-global.cpcdn.com/003_recipes/2acace97214b168d/751x532cq70/tempe-dan-ayam-bacem-foto-resep-utama.jpg"},
            {"Tumis Tempe", "Bahan-bahan\t\n" +
                    "Kacang panjang 1ikat petikin\n" +
                    "1/2 tempe potong kotak\n" +
                    "3 sdt Kecap manis\n" +
                    "3 btr Kemiri\n" +
                    "3 btr Baput\n" +
                    "3 btr Namer\n" +
                    "Gula merah sckupnya\n" +
                    "sesuai slera Pnyedap\n" +
                    "1 sdt Garam\n" +
                    "5 bj Cabai merah\n" +
                    "1 buah Tomat\n" +
                    "Daun salam 3lmbar\n" +
                    "Lengkuas stengh jari geprek\n" +
                    "Minyak goreng sckpnya\n" +
                    "Langkah\t\n" +
                    "Smua bahan di giling kcuali daun salam dan lengkuas,cuci kcg panjang yg sdh dipetikin.\n" +
                    "\n" +
                    "  \n" +
                    "Tempe yg sdh dipotong potong digoreng trlebih dahulu lalu tiriskan agar minyak mngering\n" +
                    "\n" +
                    "  \n" +
                    "Kmudian tumis bumbu tersebut, masukan daun salam dan lengkuas tumis hingga harum beri sdikit air dan biarkan hingga mndidih lalu masukan kcg panjang tumis hingga empuk dan stelah agak mngental masukan irisan gula merah dan beri kecap manis tabur tempe trsbut hingga diaduk tercampur rata,\n" +
                    "\n" +
                    "  \n" +
                    "Stelah meresap hingga berwarna agak kcoklatan dan mulai mengering angkat sajikan slagi panas...\uD83D\uDE0B", "https://img-global.cpcdn.com/003_recipes/9778c6fee2906e86/751x532cq70/tumis-tempe-campur-kacang-panjang-foto-resep-utama.jpg"},
            {"Donat", "Bahan-bahan\t\n" +
                    "250 gram kentang (kukus lalu haluskan)\n" +
                    "500 gram tepung terigu (sy pakai cakra)\n" +
                    "2 butir kuning telur\n" +
                    "5 sdm gula pasir\n" +
                    "2 sdm fermipan\n" +
                    "2 sdm margarin\n" +
                    "80 ml Air\n" +
                    "2 sdm susu bubuk\n" +
                    "Langkah\t\n" +
                    "Campur semua bahan jd satu,kemudian tambahkan air sedikit demi sedikit,jika masih terasa lengket tambahkan terigu dan uleni lg sampai kalis\n" +
                    "\n" +
                    "  \n" +
                    "Kemudian diamkan selama 45menit dan ditutup kain\n" +
                    "\n" +
                    "  \n" +
                    "Lalu cetak donat dan diamkan lg selama 15mnt\n" +
                    "\n" +
                    "  \n" +
                    "Panaskan minyak dan goreng donat dengan api sedang\n" +
                    "\n" +
                    "  ", "https://img-global.cpcdn.com/003_recipes/f317aab07dbdea0b/751x532cq70/donat-kentang-foto-resep-utama.jpg"}

    };

    public static ArrayList<ResepMasak> getListData(){
        ResepMasak resep = null;
        ArrayList<ResepMasak> list = new ArrayList<>();
        for (String[] aData : data) {
            resep = new ResepMasak();
            resep.setName(aData[0]);
            resep.setRemarks(aData[1]);
            resep.setPhoto(aData[2]);

            list.add(resep);
        }

        return list;
    }
}
