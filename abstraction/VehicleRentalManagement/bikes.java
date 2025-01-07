public class bikes extends vehicle{
    public double dailyrate;
    public double mileage;
    public bikes(String id,double dailyrate,double mileage)
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
