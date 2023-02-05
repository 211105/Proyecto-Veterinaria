package com.example.demo.Controllers;

import com.example.demo.Entities.Mob;
import com.example.demo.Services.MobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.QueryParam;

import java.util.List;

@RestController
@RequestMapping("mob")
public class MobController {

    @Autowired
    private MobServices services;

    @GetMapping
    List<Mob> getList(){
        return services.getList();
    }

    @PostMapping
    public Mob postAdd(@RequestBody Mob mob){
        return services.postAdd(mob);
    }

    @PutMapping
    public Mob PostModify(@RequestBody @Validated Mob mob){
        return  services.putModify(mob);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") int id){
        services.delete(id);
    }

    @GetMapping("/listid")
    public Mob getItem(@QueryParam("id") int id){
        return services.getIteId(id);
    }
    //@DeleteMapping("/delete")
    //public void delete(@QueryParam("id") int id){
    //    services.delete(id);
    //}

    //@DeleteMapping("/delete/{id}")
    //public void delete(@PathVariable("id") int id){
     //   services.delete(id);
    //}



}
