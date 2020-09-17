package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

public class RecordInsertDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private Long gameId;

    public RecordInsertDTO() {
    }

    public RecordInsertDTO(String name, Integer age, Long gameId) {
        this.name = name;
        this.age = age;
        this.gameId = gameId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getGameId() {
        return this.gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public RecordInsertDTO name(String name) {
        this.name = name;
        return this;
    }

    public RecordInsertDTO age(Integer age) {
        this.age = age;
        return this;
    }

    public RecordInsertDTO gameId(Long gameId) {
        this.gameId = gameId;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecordInsertDTO other = (RecordInsertDTO) obj;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + ", gameId='" + getGameId() + "'" + "}";
    }

}
