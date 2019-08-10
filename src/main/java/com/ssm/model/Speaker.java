package com.ssm.model;

public class Speaker {
    private Integer id;
    private String speaker_name;
    private String speaker_desc;
    private String speaker_job;
    private String pir_url;

    public Speaker() {
    }

    public Speaker(Integer id, String speaker_name, String speaker_desc, String speaker_job, String pir_url) {
        this.id = id;
        this.speaker_name = speaker_name;
        this.speaker_desc = speaker_desc;
        this.speaker_job = speaker_job;
        this.pir_url = pir_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpeaker_name() {
        return speaker_name;
    }

    public void setSpeaker_name(String speaker_name) {
        this.speaker_name = speaker_name;
    }

    public String getSpeaker_desc() {
        return speaker_desc;
    }

    public void setSpeaker_desc(String speaker_desc) {
        this.speaker_desc = speaker_desc;
    }

    public String getSpeaker_job() {
        return speaker_job;
    }

    public void setSpeaker_job(String speaker_job) {
        this.speaker_job = speaker_job;
    }

    public String getPir_url() {
        return pir_url;
    }

    public void setPir_url(String pir_url) {
        this.pir_url = pir_url;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "id=" + id +
                ", speaker_name='" + speaker_name + '\'' +
                ", speaker_desc='" + speaker_desc + '\'' +
                ", speaker_job='" + speaker_job + '\'' +
                ", pir_url='" + pir_url + '\'' +
                '}';
    }
}
