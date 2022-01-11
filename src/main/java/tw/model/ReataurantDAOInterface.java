package tw.model;

import java.util.List;

public interface ReataurantDAOInterface {
	
	public RestaurantBean insert(RestaurantBean resBean);
	public RestaurantBean select(int resId);
	public List<RestaurantBean> selectAll();
	public RestaurantBean updateOne(int resId, String resName);
	public boolean deleteOne(int resId);

}
