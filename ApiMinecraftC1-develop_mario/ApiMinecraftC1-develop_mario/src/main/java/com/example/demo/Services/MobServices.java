package com.example.demo.Services;

import com.example.demo.Entities.Mob;
import com.example.demo.Repositories.IMobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MobServices {

    @Autowired
    private IMobRepository crudService;

    public List<Mob> getList(){return  crudService.findAll(); }



    public Mob postAdd(Mob mob){
        return crudService.save(mob);
    }


    public Mob putModify(Mob mob){
        Mob modify = crudService.findById(mob.getId());
        modify.setName(mob.getName());
        modify.setNature(mob.getNature());
        modify.setDamage(mob.getDamage());
        return crudService.save(modify);
    }
    public void delete(int id){
        Mob mobid = crudService.findById(id);
        crudService.delete(mobid);
    }
    public Mob getIteId(int id){
        Mob mobId = crudService.findById(id);
        return mobId;
    }

}
