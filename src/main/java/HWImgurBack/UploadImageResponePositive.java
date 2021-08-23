package HWImgurBack;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data",
        "success",
        "status"
})
@Generated("jsonschema2pojo")
public class UploadImageResponePositive implements Serializable
{

    @JsonProperty("data")
    private UploadImageResponePositiveData data;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("status")
    private Integer status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4583613972883801252L;

    @JsonProperty("data")
    public UploadImageResponePositiveData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(UploadImageResponePositiveData data) {
        this.data = data;
    }

    public UploadImageResponePositive withData(UploadImageResponePositiveData data) {
        this.data = data;
        return this;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public UploadImageResponePositive withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    public UploadImageResponePositive withStatus(Integer status) {
        this.status = status;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UploadImageResponePositive withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
