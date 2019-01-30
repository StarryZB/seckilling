package org.seckilling.beans;

public class Success {
    private long seckillId;
    private long userId;
    private Integer state;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Success{" +
                "seckillId=" + seckillId +
                ", userId=" + userId +
                ", state=" + state +
                '}';
    }
}
