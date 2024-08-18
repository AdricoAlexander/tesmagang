package restapiadrico.magang.Service;

import restapiadrico.magang.Entity.Proyek;

import java.util.List;

public interface ProyekService {

    List<Proyek> findAll();

    Proyek findById(Long id);

    Proyek update(Long id, Proyek proyek);

    Proyek create(Proyek proyek);

    void delete(Long id);
}
