package com.ebookstore.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUSTOMERID")
	private int customerId;

	@Column(name="CUSTOMERNAME")
    private String customerName;

	@Column(name="CUSTOMEREMAIL")
    private String customerEmail;
    
	@Column(name="CUSTOMERPHONE")
    private String customerPhone;

	@Column(name="NICKNAME")
    private String nickname;

	@Column(name="USERNAME")
    private String username;

	@Column(name="PASSWORD")
    private String password;

	@Column(name="ENABLED")
    private boolean enabled;
	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="shippingAddressId")
//    private ShippingAddress shippingAddress;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="creditCardId")
//    private CreditCard creditCard;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cartId")
//    private Cart cart;
	
	public Customer() {
		
	}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


//    public ShippingAddress getShippingAddress() {
//        return shippingAddress;
//    }
//
//    public void setShippingAddress(ShippingAddress shippingAddress) {
//        this.shippingAddress = shippingAddress;
//    }
//
//    public CreditCard getCreditCard() {
//        return creditCard;
//    }
//
//    public void setCreditCard(CreditCard creditcard) {
//        this.creditCard = creditcard;
//    }
//
//    public Cart getCart() {
//        return cart;
//    }
//
//    public void setCart(Cart cart) {
//        this.cart = cart;
//    }

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", nickname=" + nickname + ", username="
				+ username + ", password=" + password + ", enabled=" + enabled + "]";
	}


}
