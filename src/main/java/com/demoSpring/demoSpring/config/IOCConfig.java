package com.demoSpring.demoSpring.config;

import com.demoSpring.demoSpring.entity.Role;
import com.demoSpring.demoSpring.entity.User;
import com.demoSpring.demoSpring.service.TimeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  // Khai báo đây là file cấu hình cho Spring ở tầng config
public class IOCConfig {

    // @Bean : Khai báo cho Spring biết đây là nơi khai báo các đối tượng (Bean) gán sẵn giá trị
    // và đưa lên IOC Container

    // @Primary : Khi có nhiều Bean cùng kiểu dữ liệu, ưu tiên lấy Bean có @Primary

    // @Value : lấy giá trị từ file application.properties


    @Value("${user.username}")
    private String username;

    @Value("${role.name}")
    private String role;

    @Bean
    public TimeService timeService() {
        return new TimeService();
    }

    @Bean(name = "Nguyen Van A")
    public User user(){
        System.out.println("Initial Bean User");
        User user = new User();
        user.setId(1);
        user.setName(username);
        return user;
    }

    @Bean(name = "Tran Van C")
    @Primary
    public User user2(){
        System.out.println("Initial Bean User2");
        User user = new User();
        user.setId(2);
        user.setName("Tran Van C");
        return user;
    }

    @Bean
    public Role role(@Qualifier("Nguyen Van A") User user, User user2){
        System.out.println("Initial Bean Role " + user.getName() + " " + user2.getName());
        Role role = new Role();
        role.setId(1);
        role.setName("Admin");
        role.setUsername(user.getName());
        return role;
    }



}