package org.uebungsblatt.lv1.warenkorb;

public class Cart implements Comparable<Cart> {
	
	private String username;
	private int numArticle;
	private int toalltems;
	private double totalAmount;
	
	public Cart(String username, int numArticle, int toalltems, double totalAmount) {
		super();
		this.username = username;
		this.numArticle = numArticle;
		this.toalltems = toalltems;
		this.totalAmount = totalAmount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNumArticle() {
		return numArticle;
	}

	public void setNumArticle(int numArticle) {
		this.numArticle = numArticle;
	}

	public int getToalltems() {
		return toalltems;
	}

	public void setToalltems(int toalltems) {
		this.toalltems = toalltems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Cart [username=" + username + ", numArticle=" + numArticle + ", toalltems=" + toalltems
				+ ", totalAmount=" + totalAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numArticle;
		result = prime * result + toalltems;
		long temp;
		temp = Double.doubleToLongBits(totalAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Cart other = (Cart) obj;
		if (numArticle != other.numArticle)
			return false;
		if (toalltems != other.toalltems)
			return false;
		if (Double.doubleToLongBits(totalAmount) != Double.doubleToLongBits(other.totalAmount))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cart o) {
		if(this.totalAmount < o.totalAmount) {
			return 1;
		}
		if(this.totalAmount > o.totalAmount) {
			return -1;
		}
		return 0;
	}

}
