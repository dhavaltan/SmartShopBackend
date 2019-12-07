package com.cognizant.smartshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userfeedback")
public class UserFeedback {
	
	@Column(name="user_id")
	private String userId;
	
	@Id
	@Column(name="assesment_id")
	private int assesmentId;
	
	@Column(name="rating_question1")
	private String ratingQues1;
	
	@Column(name="rating_question2")
	private String ratingQues2;
	
	@Column(name="rating_question3")
	private String ratingQues3;
	
	@Column(name="rating_question4")
	private String ratingQues4;
	
	@Column(name="rating_question5")
	private String ratingQues5;
	
	@Column(name="rating_question6")
	private String ratingQues6;
	
	@Column(name="rating_question7")
	private String ratingQues7;
	
	@Column(name="rating_question8")
	private String ratingQues8;
	
	@Column(name="rating_question9")
	private String ratingQues9;
	
	@Column(name="rating_question10")
	private String ratingQues10;

	public UserFeedback() {
		super();
	}

	public UserFeedback(String userId, String ratingQues1, String ratingQues2, String ratingQues3,
			String ratingQues4, String ratingQues5, String ratingQues6, String ratingQues7, String ratingQues8,
			String ratingQues9, String ratingQues10) {
		super();
		this.userId = userId;
		this.ratingQues1 = ratingQues1;
		this.ratingQues2 = ratingQues2;
		this.ratingQues3 = ratingQues3;
		this.ratingQues4 = ratingQues4;
		this.ratingQues5 = ratingQues5;
		this.ratingQues6 = ratingQues6;
		this.ratingQues7 = ratingQues7;
		this.ratingQues8 = ratingQues8;
		this.ratingQues9 = ratingQues9;
		this.ratingQues10 = ratingQues10;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAssesmentId() {
		return assesmentId;
	}

	public void setAssesmentId(int assesmentId) {
		this.assesmentId = assesmentId;
	}

	public String getRatingQues1() {
		return ratingQues1;
	}

	public void setRatingQues1(String ratingQues1) {
		this.ratingQues1 = ratingQues1;
	}

	public String getRatingQues2() {
		return ratingQues2;
	}

	public void setRatingQues2(String ratingQues2) {
		this.ratingQues2 = ratingQues2;
	}

	public String getRatingQues3() {
		return ratingQues3;
	}

	public void setRatingQues3(String ratingQues3) {
		this.ratingQues3 = ratingQues3;
	}

	public String getRatingQues4() {
		return ratingQues4;
	}

	public void setRatingQues4(String ratingQues4) {
		this.ratingQues4 = ratingQues4;
	}

	public String getRatingQues5() {
		return ratingQues5;
	}

	public void setRatingQues5(String ratingQues5) {
		this.ratingQues5 = ratingQues5;
	}

	public String getRatingQues6() {
		return ratingQues6;
	}

	public void setRatingQues6(String ratingQues6) {
		this.ratingQues6 = ratingQues6;
	}

	public String getRatingQues7() {
		return ratingQues7;
	}

	public void setRatingQues7(String ratingQues7) {
		this.ratingQues7 = ratingQues7;
	}

	public String getRatingQues8() {
		return ratingQues8;
	}

	public void setRatingQues8(String ratingQues8) {
		this.ratingQues8 = ratingQues8;
	}

	public String getRatingQues9() {
		return ratingQues9;
	}

	public void setRatingQues9(String ratingQues9) {
		this.ratingQues9 = ratingQues9;
	}

	public String getRatingQues10() {
		return ratingQues10;
	}

	public void setRatingQues10(String ratingQues10) {
		this.ratingQues10 = ratingQues10;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assesmentId;
		result = prime * result + ((ratingQues1 == null) ? 0 : ratingQues1.hashCode());
		result = prime * result + ((ratingQues10 == null) ? 0 : ratingQues10.hashCode());
		result = prime * result + ((ratingQues2 == null) ? 0 : ratingQues2.hashCode());
		result = prime * result + ((ratingQues3 == null) ? 0 : ratingQues3.hashCode());
		result = prime * result + ((ratingQues4 == null) ? 0 : ratingQues4.hashCode());
		result = prime * result + ((ratingQues5 == null) ? 0 : ratingQues5.hashCode());
		result = prime * result + ((ratingQues6 == null) ? 0 : ratingQues6.hashCode());
		result = prime * result + ((ratingQues7 == null) ? 0 : ratingQues7.hashCode());
		result = prime * result + ((ratingQues8 == null) ? 0 : ratingQues8.hashCode());
		result = prime * result + ((ratingQues9 == null) ? 0 : ratingQues9.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		UserFeedback other = (UserFeedback) obj;
		if (assesmentId != other.assesmentId)
			return false;
		if (ratingQues1 == null) {
			if (other.ratingQues1 != null)
				return false;
		} else if (!ratingQues1.equals(other.ratingQues1))
			return false;
		if (ratingQues10 == null) {
			if (other.ratingQues10 != null)
				return false;
		} else if (!ratingQues10.equals(other.ratingQues10))
			return false;
		if (ratingQues2 == null) {
			if (other.ratingQues2 != null)
				return false;
		} else if (!ratingQues2.equals(other.ratingQues2))
			return false;
		if (ratingQues3 == null) {
			if (other.ratingQues3 != null)
				return false;
		} else if (!ratingQues3.equals(other.ratingQues3))
			return false;
		if (ratingQues4 == null) {
			if (other.ratingQues4 != null)
				return false;
		} else if (!ratingQues4.equals(other.ratingQues4))
			return false;
		if (ratingQues5 == null) {
			if (other.ratingQues5 != null)
				return false;
		} else if (!ratingQues5.equals(other.ratingQues5))
			return false;
		if (ratingQues6 == null) {
			if (other.ratingQues6 != null)
				return false;
		} else if (!ratingQues6.equals(other.ratingQues6))
			return false;
		if (ratingQues7 == null) {
			if (other.ratingQues7 != null)
				return false;
		} else if (!ratingQues7.equals(other.ratingQues7))
			return false;
		if (ratingQues8 == null) {
			if (other.ratingQues8 != null)
				return false;
		} else if (!ratingQues8.equals(other.ratingQues8))
			return false;
		if (ratingQues9 == null) {
			if (other.ratingQues9 != null)
				return false;
		} else if (!ratingQues9.equals(other.ratingQues9))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserFeedback [userId=" + userId + ", assesmentId=" + assesmentId + ", ratingQues1=" + ratingQues1
				+ ", ratingQues2=" + ratingQues2 + ", ratingQues3=" + ratingQues3 + ", ratingQues4=" + ratingQues4
				+ ", ratingQues5=" + ratingQues5 + ", ratingQues6=" + ratingQues6 + ", ratingQues7=" + ratingQues7
				+ ", ratingQues8=" + ratingQues8 + ", ratingQues9=" + ratingQues9 + ", ratingQues10=" + ratingQues10
				+ "]";
	}
	

}
