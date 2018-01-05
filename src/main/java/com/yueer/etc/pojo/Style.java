package com.yueer.etc.pojo;

import java.io.Serializable;

public class Style  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5295823635477690803L;

	private Integer stid;

    private String style;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }
}