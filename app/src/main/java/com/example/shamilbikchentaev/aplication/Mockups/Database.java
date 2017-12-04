package com.example.shamilbikchentaev.aplication.Mockups;

import com.example.shamilbikchentaev.aplication.Models.EntryLogin;

import java.util.ArrayList;

/**
 * Singleton база данных
 */

public class Database {

    final private ArrayList<EntryLogin>logins = new ArrayList<EntryLogin>(){{
       add(new EntryLogin("boris","boris"));
       add(new EntryLogin("vova123","vova123"));
       add(new EntryLogin("georgy","georgy"));
       add(new EntryLogin("walker","walker"));
    }};

    public boolean validate(EntryLogin el){
        for (EntryLogin elem: logins) {
            if (elem.getLogin().equals(el.getLogin()) &&
                    elem.getPassword().equals(el.getPassword()))

                return true;
        }
        return false;
    }

    private static Database db = new Database();

    public static Database getInstance(){
        return db;
    }

    private Database(){}
}
