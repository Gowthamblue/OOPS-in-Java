public class trucks extends vehicle{
    public double dailyrate;
    public double mileage;
    public trucks(String id,double dailyrate,double mileage)
    {
        super(id);
        this.dailyrate=dailyrate;
        this.mileage=mileage;
    }
    public double getrentalcost(int days)
    {
        return days*dailyrate;
    }
    public double getmileage()
    {
        return mileage;
    }
    
}
