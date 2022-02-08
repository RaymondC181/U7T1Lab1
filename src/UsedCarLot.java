import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    public void addCar(Car car)
    {
        inventory.add(car);
    }

    public boolean swap(int num, int num2)
    {
        if(num< inventory.size()&&num2< inventory.size()&&num>=0&&num2>=0)
        {
            Car car1 = inventory.get(num);
            Car car2 = inventory.get(num2);
            inventory.set(num, car2);
            inventory.set(num2, car1);
            return true;
        }
        else
        {
            return false;
        }
    }

}
