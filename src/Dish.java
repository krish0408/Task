
public class Dish {

	
	private String name;
	private boolean vegetarian;
	private int calories;
	private String DishType;
	
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}


	public Dish(String name, boolean vegetarian, int calories, String dishType) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		DishType = dishType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public String getDishType() {
		return DishType;
	}


	public void setDishType(String dishType) {
		DishType = dishType;
	}


	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", DishType=" + DishType
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DishType == null) ? 0 : DishType.hashCode());
		result = prime * result + calories;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (vegetarian ? 1231 : 1237);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (DishType == null) {
			if (other.DishType != null)
				return false;
		} else if (!DishType.equals(other.DishType))
			return false;
		if (calories != other.calories)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}
	
	
	
	
}
