package com.hyman.web.bean.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Jobkey implements Serializable {

	private static final long serialVersionUID = -8446511321389764053L;
	
	@Column(name="task_id")
	private String taskId;
	@Column(name="exec_date")
	private String execDate;
	
	public Jobkey(){}
	public Jobkey(String taskId, String execDate) {
		super();
		this.taskId = taskId;
		this.execDate = execDate;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getExecDate() {
		return execDate;
	}
	public void setExecDate(String execDate) {
		this.execDate = execDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((execDate == null) ? 0 : execDate.hashCode());
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
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
		Jobkey other = (Jobkey) obj;
		if (execDate == null) {
			if (other.execDate != null)
				return false;
		} else if (!execDate.equals(other.execDate))
			return false;
		if (taskId == null) {
			if (other.taskId != null)
				return false;
		} else if (!taskId.equals(other.taskId))
			return false;
		return true;
	}
}
