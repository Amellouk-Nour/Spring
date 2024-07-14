package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData(){
        System.out.println("version base de Donnée...");
        return 20;
    }
}
