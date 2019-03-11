package cn.wilmar.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Yin Guo Wei 2019/3/9
 */
@Entity
@Data
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;

    String password;
}
