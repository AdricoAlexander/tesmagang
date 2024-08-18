package restapiadrico.magang.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import restapiadrico.magang.Entity.Proyek;
import restapiadrico.magang.Model.Response;
import restapiadrico.magang.Service.ProyekService;

import java.util.List;

@RestController
public class ProyekController {

    @Autowired
    ProyekService proyekService;

    private String service = "Proyek";

    @PostMapping
    ResponseEntity<Response<Proyek>> create (@RequestBody @Validated Proyek proyek){
        String nameofCurrentMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        Response<Proyek> response = new Response<>();
        response.setService(this.getClass().getName() + nameofCurrentMethod);
        response.setMessage("Berhasil Membuat Data");

        response.setData(proyekService.create(proyek));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping("/{id}")
    ResponseEntity<Response<Proyek>> update (@PathVariable ("id") Long id, @RequestBody @Validated Proyek proyek){
        String nameofCurrentMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response<Proyek> response = new Response<>();
        response.setService(this.getClass().getName() + nameofCurrentMethod);
        response.setMessage("Berhasil Update Data");

        response.setData(proyekService.update(id, proyek));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<Response<Proyek>> getById (@PathVariable("id")Long id){
        String nameofCurrentMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response<Proyek> response = new Response<>();
        response.setService(this.getClass().getName() + nameofCurrentMethod);
        response.setMessage("Berhasil Mengambil Data Berdasarkan Id");

        response.setData(proyekService.findById(id));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping
    ResponseEntity<Response<List<Proyek>>> findAll() {
        String nameofCurrentMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response<List<Proyek>> response = new Response<>();
        response.setService(this.getClass().getName() + nameofCurrentMethod);
        response.setMessage("Berhasil Mengambil Semua Data");

        response.setData(proyekService.findAll());

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }


    @DeleteMapping("/{id}")
    ResponseEntity<Response<Proyek>> deleteById(@PathVariable("id")Long id){
        String nameofCurrentMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        Response<Proyek> response = new Response<>();
        response.setService(this.getClass().getName() + nameofCurrentMethod);
        response.setMessage("Data Berhasil Dihapus");
        response.setData(proyekService.findById(id));

        proyekService.delete(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }
}
