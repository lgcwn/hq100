package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.RoleManager;
import com.up72.hq.model.RoleSelect;
import com.up72.hq.model.RuleManagerOrder;
import org.dom4j.rule.RuleManager;

import java.text.DecimalFormat;

/**
 * 角色选拔订单
 * Created by LiuGuicheng on 2016/7/3.
 */
public class RuleManagerOrderResp extends RuleManagerOrder {
    private  String payTimeStr;
    private  String addTimeStr;
    private  String auditTimeStr;
    private RoleManager roleManager;//角色管理
    private RoleSelect roleSelect;//角色选拔
    private MemberResp memberResp;//用户
    private Integer actualPaymentsInt;
    private String actualPaymentsStr;
    private Integer ranking;//票数票名

    public String getPayTimeStr() {
        return Cnst.getFormatTime(super.getPayTime());
    }

    public void setPayTimeStr(String payTimeStr) {
        this.payTimeStr = payTimeStr;
    }

    public String getAuditTimeStr() {
        return Cnst.getFormatTime(super.getAuditTime());
    }

    public void setAuditTimeStr(String auditTimeStr) {
        this.auditTimeStr = auditTimeStr;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(super.getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }


    public RoleManager getRoleManager() {
        return roleManager;
    }

    public void setRoleManager(RoleManager roleManager) {
        this.roleManager = roleManager;
    }

    public RoleSelect getRoleSelect() {
        return roleSelect;
    }

    public void setRoleSelect(RoleSelect roleSelect) {
        this.roleSelect = roleSelect;
    }

    public MemberResp getMemberResp() {
        return memberResp;
    }

    public void setMemberResp(MemberResp memberResp) {
        this.memberResp = memberResp;
    }

    public Integer getActualPaymentsInt() {
        double actualPayments=getActualPayments();
        return (int)(actualPayments);
    }

    public void setActualPaymentsInt(Integer actualPaymentsInt) {
        this.actualPaymentsInt = actualPaymentsInt;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getActualPaymentsStr() {
        DecimalFormat df   = new DecimalFormat("######0.00");
        if(getActualPayments() != null){
            actualPaymentsStr=df.format(getActualPayments());
        }
        return actualPaymentsStr;
    }
}
