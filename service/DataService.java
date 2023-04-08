package service;

import data.User;

public interface DataService<U extends User> {

    public void add(U user);
    public void save();
    public void loading();
    
}
