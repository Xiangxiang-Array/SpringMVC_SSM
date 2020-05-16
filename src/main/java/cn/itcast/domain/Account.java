package cn.itcast.domain;

import java.io.Serializable;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: Account
 * @Description: TODO(账号信息)
 * @Author: Array
 * @Date: 2020/5/16 13:00
 */
public class Account implements Serializable {
     private Integer id;
     private String name;
     private Double money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
