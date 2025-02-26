package com.fedi.InduVizor_1.entities;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class QRQC {

    private static final List<String> NAMES = Arrays.asList("Ali", "Ahmed", "Fedi");
    private static final Random RANDOM = new Random();

    @Id
    
    private int semaine; // This will be auto-calculated based on the date

    private int obj_securete;
    private String responsable_securite;
    private String backup_securete;
    private int obj_qualite;
    private String responsable_qualite;
    private String backup_qualite;
    private int obj_OTD;
    private String responsable_OTD;
    private String backup_OTD;
    private int obj_cout;
    private String responsable_cout;
    private String backup_cout;
    private int obj_IP;
    private String responsable_IP;
    private String backup_IP;
    private LocalDate date;

    public QRQC() {
        super();
    }

    @PrePersist
    public void prePersist() {
        if (this.date == null) {
            this.date = LocalDate.now(); // Set current date if not provided
        }
        this.semaine = calculateWeekNumber(this.date); // Calculate semaine based on date

        // Set random names if not provided
        this.responsable_securite = getRandomNameIfNull(this.responsable_securite);
        this.backup_securete = getRandomNameIfNull(this.backup_securete);
        this.responsable_qualite = getRandomNameIfNull(this.responsable_qualite);
        this.backup_qualite = getRandomNameIfNull(this.backup_qualite);
        this.responsable_OTD = getRandomNameIfNull(this.responsable_OTD);
        this.backup_OTD = getRandomNameIfNull(this.backup_OTD);
        this.responsable_cout = getRandomNameIfNull(this.responsable_cout);
        this.backup_cout = getRandomNameIfNull(this.backup_cout);
        this.responsable_IP = getRandomNameIfNull(this.responsable_IP);
        this.backup_IP = getRandomNameIfNull(this.backup_IP);
    }

    // Helper method to calculate the week number of the year
    private int calculateWeekNumber(LocalDate date) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfWeekBasedYear());
    }

    // Helper method to get a random name if the field is null
    private String getRandomNameIfNull(String field) {
        return field == null ? NAMES.get(RANDOM.nextInt(NAMES.size())) : field;
    }

    // Getters and Setters
    public int getSemaine() {
        return semaine;
    }

    // Remove the setSemaine method to prevent manual setting of semaine
    // public void setSemaine(int semaine) {
    //     this.semaine = semaine;
    // }

    public int getObj_securete() {
        return obj_securete;
    }

    public void setObj_securete(int obj_securete) {
        this.obj_securete = obj_securete;
    }

    public String getResponsable_securite() {
        return responsable_securite;
    }

    public void setResponsable_securite(String responsable_securite) {
        this.responsable_securite = responsable_securite;
    }

    public String getBackup_securete() {
        return backup_securete;
    }

    public void setBackup_securete(String backup_securete) {
        this.backup_securete = backup_securete;
    }

    public int getObj_qualite() {
        return obj_qualite;
    }

    public void setObj_qualite(int obj_qualite) {
        this.obj_qualite = obj_qualite;
    }

    public String getResponsable_qualite() {
        return responsable_qualite;
    }

    public void setResponsable_qualite(String responsable_qualite) {
        this.responsable_qualite = responsable_qualite;
    }

    public String getBackup_qualite() {
        return backup_qualite;
    }

    public void setBackup_qualite(String backup_qualite) {
        this.backup_qualite = backup_qualite;
    }

    public int getObj_OTD() {
        return obj_OTD;
    }

    public void setObj_OTD(int obj_OTD) {
        this.obj_OTD = obj_OTD;
    }

    public String getResponsable_OTD() {
        return responsable_OTD;
    }

    public void setResponsable_OTD(String responsable_OTD) {
        this.responsable_OTD = responsable_OTD;
    }

    public String getBackup_OTD() {
        return backup_OTD;
    }

    public void setBackup_OTD(String backup_OTD) {
        this.backup_OTD = backup_OTD;
    }

    public int getObj_cout() {
        return obj_cout;
    }

    public void setObj_cout(int obj_cout) {
        this.obj_cout = obj_cout;
    }

    public String getResponsable_cout() {
        return responsable_cout;
    }

    public void setResponsable_cout(String responsable_cout) {
        this.responsable_cout = responsable_cout;
    }

    public String getBackup_cout() {
        return backup_cout;
    }

    public void setBackup_cout(String backup_cout) {
        this.backup_cout = backup_cout;
    }

    public int getObj_IP() {
        return obj_IP;
    }

    public void setObj_IP(int obj_IP) {
        this.obj_IP = obj_IP;
    }

    public String getResponsable_IP() {
        return responsable_IP;
    }

    public void setResponsable_IP(String responsable_IP) {
        this.responsable_IP = responsable_IP;
    }

    public String getBackup_IP() {
        return backup_IP;
    }

    public void setBackup_IP(String backup_IP) {
        this.backup_IP = backup_IP;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
        // Recalculate semaine whenever the date is updated
        this.semaine = calculateWeekNumber(date);
    }

    @Override
    public String toString() {
        return "QRQC [semaine=" + semaine + ", obj_securete=" + obj_securete + ", responsable_securite="
                + responsable_securite + ", backup_securete=" + backup_securete + ", obj_qualite=" + obj_qualite
                + ", responsable_qualite=" + responsable_qualite + ", backup_qualite=" + backup_qualite + ", obj_OTD="
                + obj_OTD + ", responsable_OTD=" + responsable_OTD + ", backup_OTD=" + backup_OTD + ", obj_cout="
                + obj_cout + ", responsable_cout=" + responsable_cout + ", backup_cout=" + backup_cout + ", obj_IP="
                + obj_IP + ", responsable_IP=" + responsable_IP + ", backup_IP=" + backup_IP + ", date=" + date + "]";
    }
}