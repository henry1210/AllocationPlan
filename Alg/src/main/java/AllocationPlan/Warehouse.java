package AllocationPlan;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    public int ID;
    public String Name;
    public int Type;//0:门店；1:仓库
    public double JD;
    public double WD;
    public Map<Integer,Commodity> CommodityMap=new HashMap<Integer,Commodity>();
}
