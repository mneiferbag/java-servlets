package eu.mneifercons.examples.service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Verb {

    @Schema()
    private String name = null;

    @Schema()
    private String first = null;

    @Schema()
    private String second = null;

    @Schema()
    private String third = null;

    @Schema()
    private String firsts = null;

    @Schema()
    private String seconds = null;

    @Schema()
    private String thirds = null;

    /**
     * Get name
     * 
     * @return name
     **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Verb name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get first
     * 
     * @return first
     **/
    @JsonProperty("first")
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Verb first(String first) {
        this.first = first;
        return this;
    }

    /**
     * Get second
     * 
     * @return second
     **/
    @JsonProperty("second")
    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public Verb second(String second) {
        this.second = second;
        return this;
    }

    /**
     * Get third
     * 
     * @return third
     **/
    @JsonProperty("third")
    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public Verb third(String third) {
        this.third = third;
        return this;
    }

    /**
     * Get firsts
     * 
     * @return firsts
     **/
    @JsonProperty("firsts")
    public String getFirsts() {
        return firsts;
    }

    public void setFirsts(String firsts) {
        this.firsts = firsts;
    }

    public Verb firsts(String firsts) {
        this.firsts = firsts;
        return this;
    }

    /**
     * Get seconds
     * 
     * @return seconds
     **/
    @JsonProperty("seconds")
    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public Verb seconds(String seconds) {
        this.seconds = seconds;
        return this;
    }

    /**
     * Get thirds
     * 
     * @return thirds
     **/
    @JsonProperty("thirds")
    public String getThirds() {
        return thirds;
    }

    public void setThirds(String thirds) {
        this.thirds = thirds;
    }

    public Verb thirds(String thirds) {
        this.thirds = thirds;
        return this;
    }

    @Override
    public String toString() {
        return "class Verb {\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    first: " + toIndentedString(first) + "\n" +
                "    second: " + toIndentedString(second) + "\n" +
                "    third: " + toIndentedString(third) + "\n" +
                "    firsts: " + toIndentedString(firsts) + "\n" +
                "    seconds: " + toIndentedString(seconds) + "\n" +
                "    thirds: " + toIndentedString(thirds) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
