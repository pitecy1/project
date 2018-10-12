package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ShipmentTracking")
@PrimaryKeyJoinColumn(name="requestId")
public class ShipmentTracking extends Request{
	
		@Column(name = "deliveryStatus",nullable=false)
		private int deliveryStatus;
		@Column(name = "reciveStatus",nullable=false)
		private int reciveStatus;
		@Column(name = "daliveryDetail",nullable=false)
		private String daliveryDetail;
		

		public ShipmentTracking() {
			
		}
		
		public ShipmentTracking(int deliveryStatus, int reciveStatus, String daliveryDetail) {
			super();
			this.deliveryStatus = deliveryStatus;
			this.reciveStatus = reciveStatus;
			this.daliveryDetail = daliveryDetail;
		}

		public int getDeliveryStatus() {
			return deliveryStatus;
		}

		public void setDeliveryStatus(int deliveryStatus) {
			this.deliveryStatus = deliveryStatus;
		}

		public int getReciveStatus() {
			return reciveStatus;
		}

		public void setReciveStatus(int reciveStatus) {
			this.reciveStatus = reciveStatus;
		}

		public String getDaliveryDetail() {
			return daliveryDetail;
		}

		public void setDaliveryDetail(String daliveryDetail) {
			this.daliveryDetail = daliveryDetail;
		}
		
		
		
}
