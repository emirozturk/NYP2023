import DataAccess.Admin.AdminDAL;
import DataAccess.*;

public class Main {
    public static void main(String[] args) {
        /*
        DataAccess.KisiDAL kisiDal;
        DataAccess.Test test;
        DataAccess.Admin.AdminDAL adminDal;
        */
        KisiDAL kisiDal = new KisiDAL();
        Test test;
        AdminDAL adminDal;
        kisiDal.ekle();
    }
}