package restapiadrico.magang.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapiadrico.magang.Entity.Proyek;
import restapiadrico.magang.Repository.ProyekRepository;

import java.util.List;

@Service
public class ProyekServiceImpl implements ProyekService {

    @Autowired
    ProyekRepository proyekRepository ;

    @Override
    public List<Proyek> findAll() {
        return proyekRepository.findAll();
    }

    @Override
    public Proyek findById(Long id) {
        return proyekRepository.findById(id).orElse(null);
    }

    @Override
    public Proyek update(Long id, Proyek proyek) {
        if (proyekRepository.existsById(id)){
            proyek.setId(id);
            return proyekRepository.save(proyek);
        } else {
            return null;
        }
    }

    @Override
    public Proyek create(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    @Override
    public void delete(Long id) {
        proyekRepository.deleteById(id);
    }
}
