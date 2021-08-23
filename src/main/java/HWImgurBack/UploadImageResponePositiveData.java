package HWImgurBack;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "description",
        "datetime",
        "type",
        "animated",
        "width",
        "height",
        "size",
        "views",
        "bandwidth",
        "vote",
        "favorite",
        "nsfw",
        "section",
        "account_url",
        "account_id",
        "is_ad",
        "in_most_viral",
        "has_sound",
        "tags",
        "ad_type",
        "ad_url",
        "edited",
        "in_gallery",
        "deletehash",
        "name",
        "link"
})
@Generated("jsonschema2pojo")
public class UploadImageResponePositiveData implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("datetime")
    private Integer datetime;
    @JsonProperty("type")
    private String type;
    @JsonProperty("animated")
    private Boolean animated;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("bandwidth")
    private Integer bandwidth;
    @JsonProperty("vote")
    private Object vote;
    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("nsfw")
    private Object nsfw;
    @JsonProperty("section")
    private Object section;
    @JsonProperty("account_url")
    private Object accountUrl;
    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("is_ad")
    private Boolean isAd;
    @JsonProperty("in_most_viral")
    private Boolean inMostViral;
    @JsonProperty("has_sound")
    private Boolean hasSound;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("ad_type")
    private Integer adType;
    @JsonProperty("ad_url")
    private String adUrl;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("in_gallery")
    private Boolean inGallery;
    @JsonProperty("deletehash")
    private String deletehash;
    @JsonProperty("name")
    private String name;
    @JsonProperty("link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2743986660954826904L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public UploadImageResponePositiveData withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    public UploadImageResponePositiveData withTitle(Object title) {
        this.title = title;
        return this;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    public UploadImageResponePositiveData withDescription(Object description) {
        this.description = description;
        return this;
    }

    @JsonProperty("datetime")
    public Integer getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public UploadImageResponePositiveData withDatetime(Integer datetime) {
        this.datetime = datetime;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public UploadImageResponePositiveData withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("animated")
    public Boolean getAnimated() {
        return animated;
    }

    @JsonProperty("animated")
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public UploadImageResponePositiveData withAnimated(Boolean animated) {
        this.animated = animated;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public UploadImageResponePositiveData withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public UploadImageResponePositiveData withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public UploadImageResponePositiveData withSize(Integer size) {
        this.size = size;
        return this;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    public UploadImageResponePositiveData withViews(Integer views) {
        this.views = views;
        return this;
    }

    @JsonProperty("bandwidth")
    public Integer getBandwidth() {
        return bandwidth;
    }

    @JsonProperty("bandwidth")
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public UploadImageResponePositiveData withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    @JsonProperty("vote")
    public Object getVote() {
        return vote;
    }

    @JsonProperty("vote")
    public void setVote(Object vote) {
        this.vote = vote;
    }

    public UploadImageResponePositiveData withVote(Object vote) {
        this.vote = vote;
        return this;
    }

    @JsonProperty("favorite")
    public Boolean getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public UploadImageResponePositiveData withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    @JsonProperty("nsfw")
    public Object getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Object nsfw) {
        this.nsfw = nsfw;
    }

    public UploadImageResponePositiveData withNsfw(Object nsfw) {
        this.nsfw = nsfw;
        return this;
    }

    @JsonProperty("section")
    public Object getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(Object section) {
        this.section = section;
    }

    public UploadImageResponePositiveData withSection(Object section) {
        this.section = section;
        return this;
    }

    @JsonProperty("account_url")
    public Object getAccountUrl() {
        return accountUrl;
    }

    @JsonProperty("account_url")
    public void setAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
    }

    public UploadImageResponePositiveData withAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
        return this;
    }

    @JsonProperty("account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public UploadImageResponePositiveData withAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("is_ad")
    public Boolean getIsAd() {
        return isAd;
    }

    @JsonProperty("is_ad")
    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public UploadImageResponePositiveData withIsAd(Boolean isAd) {
        this.isAd = isAd;
        return this;
    }

    @JsonProperty("in_most_viral")
    public Boolean getInMostViral() {
        return inMostViral;
    }

    @JsonProperty("in_most_viral")
    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public UploadImageResponePositiveData withInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
        return this;
    }

    @JsonProperty("has_sound")
    public Boolean getHasSound() {
        return hasSound;
    }

    @JsonProperty("has_sound")
    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    public UploadImageResponePositiveData withHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
        return this;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public UploadImageResponePositiveData withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("ad_type")
    public Integer getAdType() {
        return adType;
    }

    @JsonProperty("ad_type")
    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public UploadImageResponePositiveData withAdType(Integer adType) {
        this.adType = adType;
        return this;
    }

    @JsonProperty("ad_url")
    public String getAdUrl() {
        return adUrl;
    }

    @JsonProperty("ad_url")
    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public UploadImageResponePositiveData withAdUrl(String adUrl) {
        this.adUrl = adUrl;
        return this;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    public UploadImageResponePositiveData withEdited(String edited) {
        this.edited = edited;
        return this;
    }

    @JsonProperty("in_gallery")
    public Boolean getInGallery() {
        return inGallery;
    }

    @JsonProperty("in_gallery")
    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public UploadImageResponePositiveData withInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
        return this;
    }

    @JsonProperty("deletehash")
    public String getDeletehash() {
        return deletehash;
    }

    @JsonProperty("deletehash")
    public void setDeletehash(String deletehash) {
        this.deletehash = deletehash;
    }

    public UploadImageResponePositiveData withDeletehash(String deletehash) {
        this.deletehash = deletehash;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public UploadImageResponePositiveData withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    public UploadImageResponePositiveData withLink(String link) {
        this.link = link;
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

    public UploadImageResponePositiveData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
