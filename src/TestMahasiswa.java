public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa MHS = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHS.cetak();

        MHS.ubah("DITA", 2010, "Madiun");
        System.out.println("IDENTITAS AKHIR : ");
        MHS.cetak();

        Mahasiswa mhsPTI = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHS.cetak();

        mhsPTI.ubah("AZIS ROSYID", 2022, "Yogyakarta");
        System.out.println("IDENTITAS AKHIR : ");
        mhsPTI.cetak();

        Mahasiswa mhsTI = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        mhsTI.cetak();

        mhsTI.ubah("KURNIAWAN", 2010, "Surabaya");
        System.out.println("IDENTITAS AKHIR : ");
        mhsTI.cetak();
    }
}
