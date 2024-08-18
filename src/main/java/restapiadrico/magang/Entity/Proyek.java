package restapiadrico.magang.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "proyek")
public class Proyek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_proyek")
    private String namaproyek;

    @Column(name = "client")
    private String client;

    @Column(name = "tgl_mulai")
    private LocalDateTime tglmulai;

    @Column(name = "tgl_selesai")
    private LocalDateTime tglselesai;

    @Column(name = "pimpinan_proyek")
    private String pimpinanproyek;

    @Column(name = "keterangan")
    private String keterangan;

    @Column(name = "created_at")
    private LocalDateTime createdat;

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaproyek() {
        return namaproyek;
    }

    public void setNamaproyek(String namaproyek) {
        this.namaproyek = namaproyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTglmulai() {
        return tglmulai;
    }

    public void setTglmulai(LocalDateTime tglmulai) {
        this.tglmulai = tglmulai;
    }

    public LocalDateTime getTglselesai() {
        return tglselesai;
    }

    public void setTglselesai(LocalDateTime tglselesai) {
        this.tglselesai = tglselesai;
    }

    public String getPimpinanproyek() {
        return pimpinanproyek;
    }

    public void setPimpinanproyek(String pimpinanproyek) {
        this.pimpinanproyek = pimpinanproyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }
}
