abstract class BaseEntity {

    protected long id;
    protected long version;

    abstract long getId();

    abstract void setId(long id);

    abstract long getVersion();

    abstract void setVersion(long version);
}


class User extends BaseEntity {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    long getId() {
        return this.id;
    }

    @Override
    void setId(long id) {
        this.id = id;
    }

    @Override
    long getVersion() {
        return this.version;
    }

    @Override
    void setVersion(long version) {
        this.version = version;
    }
}


class Visit extends BaseEntity {

    protected User user;
    protected WebSite site;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getSite() {
        return site;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }

    @Override
    long getId() {
        return this.id;
    }

    @Override
    void setId(long id) {
        this.id = id;
    }

    @Override
    long getVersion() {
        return this.version;
    }

    @Override
    void setVersion(long version) {
        this.version = version;
    }
}


class WebSite extends BaseEntity {

    protected String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    long getId() {
        return this.id;
    }

    @Override
    void setId(long id) {
        this.id = id;
    }

    @Override
    long getVersion() {
        return this.version;
    }

    @Override
    void setVersion(long version) {
        this.version = version;
    }
}
