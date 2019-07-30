package com.momo.mapper.dataobject;

import com.momo.mapper.dataobject.WebsiteVisibleDO;

/**
 * The table 网站访问总人数
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 */
public class WebsiteVisibleDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * visibleNumber 访问总人数.
     */
    private Long visibleNumber;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set visibleNumber 访问总人数.
     */
    public void setVisibleNumber(Long visibleNumber){
        this.visibleNumber = visibleNumber;
    }

    /**
     * Get visibleNumber 访问总人数.
     *
     * @return the string
     */
    public Long getVisibleNumber(){
        return visibleNumber;
    }
}
