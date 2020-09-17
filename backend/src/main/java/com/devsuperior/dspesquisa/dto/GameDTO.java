package com.devsuperior.dspesquisa.dto;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class GameDTO {

    private Long id;
    private String title;
    private Platform platform;

    public GameDTO() {
    }

    public GameDTO(Long id, String title, Platform platform) {
        this.id = id;
        this.title = title;
        this.platform = platform;
    }

    public GameDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        platform = entity.getPlatform();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public GameDTO id(Long id) {
        this.id = id;
        return this;
    }

    public GameDTO title(String title) {
        this.title = title;
        return this;
    }

    public GameDTO platform(Platform platform) {
        this.platform = platform;
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
        GameDTO other = (GameDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", platform='" + getPlatform() + "'" +
            "}";
    }
}
