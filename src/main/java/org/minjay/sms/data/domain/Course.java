package org.minjay.sms.data.domain;

import javax.persistence.*;

/**
 * Created by minjay on 2017/1/18.
 */
@Entity
public class Course extends AbstractEntityAuditable<Integer>{

    private static final long serialVersionUID = 1L;

    private String num;

    private String name;

    private Teacher teacher;

    private String time;

    private String address;

    private long version;

    @Id
    @GeneratedValue
    public Integer getId() {
        return super.getId();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Version
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
