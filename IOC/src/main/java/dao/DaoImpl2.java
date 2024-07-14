package dao;

public class DaoImpl2 implements IDao{
    @Override
    public double getData() {
        System.out.println("version Capteur");
        return 32;
    }
}
