/*
 * Copyright (c) KYE 2019, All Rights Reserved
 */

package com.ramesses.jetpackdemo.bean;

import java.util.List;

/**
 * Routing
 * Desc    TODO
 * Source
 * Created by LWS on 2019-09-05 17:06
 * Version 1.0
 */
public class MusicResponse {

    /**
     * total : 1
     * result : [{"id":"6553613","rating":{"max":"10","numRaters":"1218","average":"9.3",
     * "min":"0"},"title":"传奇","alt_title":"当有天老去","image":"http://api.avatardata
     * .cn/Music/Img?file=3df8a35c171642b7a136b80b1507f7ed.jpg","summary":null,"attrs":{
     * "publisher":["天津泰达"],"singer":["李健"],"version":["专辑"],"pubdate":["2010-8-4"],
     * "title":["传奇"],"media":["CD"],"tracks":["01、传奇\n02、当年天老去\n03、似水流年\n04、绽放\n05、我愿人长久\n06
     * 、远\n07、为你而来\n08、云上的日子\n09、八月照相馆\n10、恋人\n11、什刹海\n12、向往\n13、父亲\n14、一辈子的十分钟\nNTV\n01、似水流年\n02
     * 、绽放\n03、一辈子的十分钟\n04、为你而来\n05、向往\n06、远"],"discs":["2"]},"author":[{"name":"李健"}],"tags":[{
     * "count":346,"name":"李健"},{"count":137,"name":"民谣"},{"count":69,"name":"内地"},{"count":63,
     * "name":"单曲"},{"count":61,"name":"华语"},{"count":49,"name":"大陆"},{"count":48,"name":"当有天老去"}
     * ,{"count":46,"name":"内地音乐"}]}]
     * error_code : 0
     * reason : Succes
     */

    private int total;
    private int              error_code;
    private String           reason;
    private List<ResultBean> result;

    public int getTotal() {

        return total;
    }

    public void setTotal(int total) {

        this.total = total;
    }

    public int getError_code() {

        return error_code;
    }

    public void setError_code(int error_code) {

        this.error_code = error_code;
    }

    public String getReason() {

        return reason;
    }

    public void setReason(String reason) {

        this.reason = reason;
    }

    public List<ResultBean> getResult() {

        return result;
    }

    public void setResult(List<ResultBean> result) {

        this.result = result;
    }

    public static class ResultBean {

        /**
         * id : 6553613
         * rating : {"max":"10","numRaters":"1218","average":"9.3","min":"0"}
         * title : 传奇
         * alt_title : 当有天老去
         * image : http://api.avatardata.cn/Music/Img?file=3df8a35c171642b7a136b80b1507f7ed.jpg
         * summary : null
         * attrs : {"publisher":["天津泰达"],"singer":["李健"],"version":["专辑"],"pubdate":["2010-8-4"],
         * "title":["传奇"],"media":["CD"],"tracks":["01、传奇\n02、当年天老去\n03、似水流年\n04、绽放\n05、我愿人长久\n06
         * 、远\n07、为你而来\n08、云上的日子\n09、八月照相馆\n10、恋人\n11、什刹海\n12、向往\n13、父亲\n14、一辈子的十分钟\nNTV\n01
         * 、似水流年\n02、绽放\n03、一辈子的十分钟\n04、为你而来\n05、向往\n06、远"],"discs":["2"]}
         * author : [{"name":"李健"}]
         * tags : [{"count":346,"name":"李健"},{"count":137,"name":"民谣"},{"count":69,"name":"内地"},{
         * "count":63,"name":"单曲"},{"count":61,"name":"华语"},{"count":49,"name":"大陆"},{"count":48,
         * "name":"当有天老去"},{"count":46,"name":"内地音乐"}]
         */

        private String id;
        private RatingBean       rating;
        private String           title;
        private String           alt_title;
        private String           image;
        private Object           summary;
        private AttrsBean        attrs;
        private List<AuthorBean> author;
        private List<TagsBean>   tags;

        public String getId() {

            return id;
        }

        public void setId(String id) {

            this.id = id;
        }

        public RatingBean getRating() {

            return rating;
        }

        public void setRating(RatingBean rating) {

            this.rating = rating;
        }

        public String getTitle() {

            return title;
        }

        public void setTitle(String title) {

            this.title = title;
        }

        public String getAlt_title() {

            return alt_title;
        }

        public void setAlt_title(String alt_title) {

            this.alt_title = alt_title;
        }

        public String getImage() {

            return image;
        }

        public void setImage(String image) {

            this.image = image;
        }

        public Object getSummary() {

            return summary;
        }

        public void setSummary(Object summary) {

            this.summary = summary;
        }

        public AttrsBean getAttrs() {

            return attrs;
        }

        public void setAttrs(AttrsBean attrs) {

            this.attrs = attrs;
        }

        public List<AuthorBean> getAuthor() {

            return author;
        }

        public void setAuthor(List<AuthorBean> author) {

            this.author = author;
        }

        public List<TagsBean> getTags() {

            return tags;
        }

        public void setTags(List<TagsBean> tags) {

            this.tags = tags;
        }

        public static class RatingBean {

            /**
             * max : 10
             * numRaters : 1218
             * average : 9.3
             * min : 0
             */

            private String max;
            private String numRaters;
            private String average;
            private String min;

            public String getMax() {

                return max;
            }

            public void setMax(String max) {

                this.max = max;
            }

            public String getNumRaters() {

                return numRaters;
            }

            public void setNumRaters(String numRaters) {

                this.numRaters = numRaters;
            }

            public String getAverage() {

                return average;
            }

            public void setAverage(String average) {

                this.average = average;
            }

            public String getMin() {

                return min;
            }

            public void setMin(String min) {

                this.min = min;
            }
        }


        public static class AttrsBean {

            private List<String> publisher;
            private List<String> singer;
            private List<String> version;
            private List<String> pubdate;
            private List<String> title;
            private List<String> media;
            private List<String> tracks;
            private List<String> discs;

            public List<String> getPublisher() {

                return publisher;
            }

            public void setPublisher(List<String> publisher) {

                this.publisher = publisher;
            }

            public List<String> getSinger() {

                return singer;
            }

            public void setSinger(List<String> singer) {

                this.singer = singer;
            }

            public List<String> getVersion() {

                return version;
            }

            public void setVersion(List<String> version) {

                this.version = version;
            }

            public List<String> getPubdate() {

                return pubdate;
            }

            public void setPubdate(List<String> pubdate) {

                this.pubdate = pubdate;
            }

            public List<String> getTitle() {

                return title;
            }

            public void setTitle(List<String> title) {

                this.title = title;
            }

            public List<String> getMedia() {

                return media;
            }

            public void setMedia(List<String> media) {

                this.media = media;
            }

            public List<String> getTracks() {

                return tracks;
            }

            public void setTracks(List<String> tracks) {

                this.tracks = tracks;
            }

            public List<String> getDiscs() {

                return discs;
            }

            public void setDiscs(List<String> discs) {

                this.discs = discs;
            }
        }


        public static class AuthorBean {

            /**
             * name : 李健
             */

            private String name;

            public String getName() {

                return name;
            }

            public void setName(String name) {

                this.name = name;
            }
        }


        public static class TagsBean {

            /**
             * count : 346
             * name : 李健
             */

            private int count;
            private String name;

            public int getCount() {

                return count;
            }

            public void setCount(int count) {

                this.count = count;
            }

            public String getName() {

                return name;
            }

            public void setName(String name) {

                this.name = name;
            }
        }
    }
}
