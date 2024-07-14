package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;
    public void setDao(IDao dao){
        this.dao = dao ;
    }
    @Override
    public double Calcule() {
        return dao.getData()*460;
    }

}
