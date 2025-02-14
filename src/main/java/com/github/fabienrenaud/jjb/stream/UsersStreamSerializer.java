package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.google.gson.stream.JsonWriter;
import com.grack.nanojson.JsonAppendableWriter;
import com.owlike.genson.stream.ObjectWriter;

import io.github.senthilganeshs.parser.json.Parser;
import io.github.senthilganeshs.parser.json.Parser.Value;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UsersStreamSerializer implements StreamSerializer<Users> {

    @Override
    public org.json.JSONObject orgjson(Users obj) throws JSONException {
        org.json.JSONObject jso = new org.json.JSONObject();
        if (obj.users != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (User u : obj.users) {
                jsarr.put(orgjson(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.json.JSONObject orgjson(User u) throws JSONException {
        org.json.JSONObject jso = new org.json.JSONObject();
        if (u._id != null) {
            jso.put("_id", u._id);
        }
        jso.put("index", u.index);
        if (u.guid != null) {
            jso.put("guid", u.guid);
        }
        jso.put("isActive", u.isActive);
        if (u.balance != null) {
            jso.put("balance", u.balance);
        }
        if (u.picture != null) {
            jso.put("picture", u.picture);
        }
        jso.put("age", u.age);
        if (u.eyeColor != null) {
            jso.put("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.put("name", u.name);
        }
        if (u.gender != null) {
            jso.put("gender", u.gender);
        }
        if (u.company != null) {
            jso.put("company", u.company);
        }
        if (u.email != null) {
            jso.put("email", u.email);
        }
        if (u.phone != null) {
            jso.put("phone", u.phone);
        }
        if (u.address != null) {
            jso.put("address", u.address);
        }
        if (u.about != null) {
            jso.put("about", u.about);
        }
        if (u.registered != null) {
            jso.put("registered", u.registered);
        }
        jso.put("latitude", u.latitude);
        jso.put("longitude", u.longitude);
        if (u.tags != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (String t : u.tags) {
                jsarr.put(t);
            }
            jso.put("tags", jsarr);
        }
        if (u.friends != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (Friend f : u.friends) {
                org.json.JSONObject jso0 = new org.json.JSONObject();
                jso0.put("id", f.id);
                jso0.put("name", f.name);
                jsarr.put(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.put("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.put("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public void javaxjson(javax.json.stream.JsonGenerator generator, Users obj) throws IOException {
        generator.writeStartObject();
        if (obj.users != null) {
            generator.writeStartArray("users");
            for (User u : obj.users) {
                javaxjson(generator, u);
            }
            generator.writeEnd();
        }
        generator.writeEnd();
    }

    private void javaxjson(javax.json.stream.JsonGenerator generator, User u) throws IOException {
        generator.writeStartObject();
        if (u._id != null) {
            generator.write("_id", u._id);
        }
        generator.write("index",u.index);
        if (u.guid != null) {
            generator.write("guid",u.guid);
        }
        generator.write("isActive",u.isActive);
        if (u.balance != null) {
            generator.write("balance",u.balance);
        }
        if (u.picture != null) {
            generator.write("picture",u.picture);
        }
        generator.write("age",u.age);
        if (u.eyeColor != null) {
            generator.write("eyeColor",u.eyeColor);
        }
        if (u.name != null) {
            generator.write("name",u.name);
        }
        if (u.gender != null) {
            generator.write("gender",u.gender);
        }
        if (u.company != null) {
            generator.write("company",u.company);
        }
        if (u.email != null) {
            generator.write("email",u.email);
        }
        if (u.phone != null) {
            generator.write("phone",u.phone);
        }
        if (u.address != null) {
            generator.write("address",u.address);
        }
        if (u.about != null) {
            generator.write("about",u.about);
        }
        if (u.registered != null) {
            generator.write("registered",u.registered);
        }
        generator.write("latitude",u.latitude);
        generator.write("longitude",u.longitude);
        if (u.tags != null) {
            generator.writeStartArray("tags");
            for (String t : u.tags) {
                generator.write(t);
            }
            generator.writeEnd();
        }
        if (u.friends != null) {
            generator.writeStartArray("friends");
            for (Friend f : u.friends) {
                generator.writeStartObject();
                generator.write("id",f.id);
                generator.write("name",f.name);
                generator.writeEnd();
            }
            generator.writeEnd();
        }
        if (u.greeting != null) {
            generator.write("greeting",u.greeting);
        }
        if (u.favoriteFruit != null) {
            generator.write("favoriteFruit",u.favoriteFruit);
        }
        generator.writeEnd();
    }

    @Override
    public void genson(ObjectWriter j, Users obj) throws IOException {
        j.beginObject();
        if (obj.users != null) {
            j.writeName("users");
            j.beginArray();
            for (User u : obj.users) {
                genson(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private void genson(ObjectWriter j, User u) throws IOException {
        j.beginObject();
        if (u._id != null) {
            j.writeString("_id", u._id);
        }
        j.writeNumber("index", u.index);
        if (u.guid != null) {
            j.writeString("guid", u.guid);
        }
        j.writeBoolean("isActive", u.isActive);
        if (u.balance != null) {
            j.writeString("balance", u.balance);
        }
        if (u.picture != null) {
            j.writeString("picture", u.picture);
        }
        j.writeNumber("age", u.age);
        if (u.eyeColor != null) {
            j.writeString("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            j.writeString("name", u.name);
        }
        if (u.gender != null) {
            j.writeString("gender", u.gender);
        }
        if (u.company != null) {
            j.writeString("company", u.company);
        }
        if (u.email != null) {
            j.writeString("email", u.email);
        }
        if (u.phone != null) {
            j.writeString("phone", u.phone);
        }
        if (u.address != null) {
            j.writeString("address", u.address);
        }
        if (u.about != null) {
            j.writeString("about", u.about);
        }
        if (u.registered != null) {
            j.writeString("registered", u.registered);
        }
        j.writeNumber("latitude", u.latitude);
        j.writeNumber("longitude", u.longitude);
        if (u.tags != null) {
            j.writeName("tags");
            j.beginArray();
            for (String t : u.tags) {
                j.writeString(t);
            }
            j.endArray();
        }
        if (u.friends != null) {
            j.writeName("friends");
            j.beginArray();
            for (Friend f : u.friends) {
                j.beginObject();
                j.writeString("id", f.id);
                j.writeString("name", f.name);
                j.endObject();
            }
            j.endArray();
        }
        if (u.greeting != null) {
            j.writeString("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            j.writeString("favoriteFruit", u.favoriteFruit);
        }
        j.endObject();
    }

    @Override
    public void gson(JsonWriter j, Users obj) throws IOException {
        j.beginObject();
        if (obj.users != null) {
            j.name("users");
            j.beginArray();
            for (User u : obj.users) {
                gson(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private void gson(JsonWriter j, User u) throws IOException {
        j.beginObject();
        if (u._id != null) {
            j.name("_id");
            j.value(u._id);
        }
        j.name("index");
        j.value(u.index);
        if (u.guid != null) {
            j.name("guid");
            j.value(u.guid);
        }
        j.name("isActive");
        j.value(u.isActive);
        if (u.balance != null) {
            j.name("balance");
            j.value(u.balance);
        }
        if (u.picture != null) {
            j.name("picture");
            j.value(u.picture);
        }
        j.name("age");
        j.value(u.age);
        if (u.eyeColor != null) {
            j.name("eyeColor");
            j.value(u.eyeColor);
        }
        if (u.name != null) {
            j.name("name");
            j.value(u.name);
        }
        if (u.gender != null) {
            j.name("gender");
            j.value(u.gender);
        }
        if (u.company != null) {
            j.name("company");
            j.value(u.company);
        }
        if (u.email != null) {
            j.name("email");
            j.value(u.email);
        }
        if (u.phone != null) {
            j.name("phone");
            j.value(u.phone);
        }
        if (u.address != null) {
            j.name("address");
            j.value(u.address);
        }
        if (u.about != null) {
            j.name("about");
            j.value(u.about);
        }
        if (u.registered != null) {
            j.name("registered");
            j.value(u.registered);
        }
        j.name("latitude");
        j.value(u.latitude);
        j.name("longitude");
        j.value(u.longitude);
        if (u.tags != null) {
            j.name("tags");
            j.beginArray();
            for (String t : u.tags) {
                j.value(t);
            }
            j.endArray();
        }
        if (u.friends != null) {
            j.name("friends");
            j.beginArray();
            for (Friend f : u.friends) {
                j.beginObject();
                j.name("id");
                j.value(f.id);
                j.name("name");
                j.value(f.name);
                j.endObject();
            }
            j.endArray();
        }
        if (u.greeting != null) {
            j.name("greeting");
            j.value(u.greeting);
        }
        if (u.favoriteFruit != null) {
            j.name("favoriteFruit");
            j.value(u.favoriteFruit);
        }
        j.endObject();
    }

    @Override
    public void jackson(JsonGenerator j, Users obj) throws IOException {
        j.writeStartObject();
        if (obj.users != null) {
            j.writeFieldName("users");
            j.writeStartArray();
            for (User u : obj.users) {
                jackson(j, u);
            }
            j.writeEndArray();
        }
        j.writeEndObject();
    }

    private void jackson(JsonGenerator j, User u) throws IOException {
        j.writeStartObject();
        if (u._id != null) {
            j.writeFieldName("_id");
            j.writeString(u._id);
        }
        j.writeFieldName("index");
        j.writeNumber(u.index);
        if (u.guid != null) {
            j.writeFieldName("guid");
            j.writeString(u.guid);
        }
        j.writeFieldName("isActive");
        j.writeBoolean(u.isActive);
        if (u.balance != null) {
            j.writeFieldName("balance");
            j.writeString(u.balance);
        }
        if (u.picture != null) {
            j.writeFieldName("picture");
            j.writeString(u.picture);
        }
        j.writeFieldName("age");
        j.writeNumber(u.age);
        if (u.eyeColor != null) {
            j.writeFieldName("eyeColor");
            j.writeString(u.eyeColor);
        }
        if (u.name != null) {
            j.writeFieldName("name");
            j.writeString(u.name);
        }
        if (u.gender != null) {
            j.writeFieldName("gender");
            j.writeString(u.gender);
        }
        if (u.company != null) {
            j.writeFieldName("company");
            j.writeString(u.company);
        }
        if (u.email != null) {
            j.writeFieldName("email");
            j.writeString(u.email);
        }
        if (u.phone != null) {
            j.writeFieldName("phone");
            j.writeString(u.phone);
        }
        if (u.address != null) {
            j.writeFieldName("address");
            j.writeString(u.address);
        }
        if (u.about != null) {
            j.writeFieldName("about");
            j.writeString(u.about);
        }
        if (u.registered != null) {
            j.writeFieldName("registered");
            j.writeString(u.registered);
        }
        j.writeFieldName("latitude");
        j.writeNumber(u.latitude);
        j.writeFieldName("longitude");
        j.writeNumber(u.longitude);
        if (u.tags != null) {
            j.writeFieldName("tags");
            j.writeStartArray();
            for (String t : u.tags) {
                j.writeString(t);
            }
            j.writeEndArray();
        }
        if (u.friends != null) {
            j.writeFieldName("friends");
            j.writeStartArray();
            for (Friend f : u.friends) {
                j.writeStartObject();
                j.writeFieldName("id");
                j.writeString(f.id);
                j.writeFieldName("name");
                j.writeString(f.name);
                j.writeEndObject();
            }
            j.writeEndArray();
        }
        if (u.greeting != null) {
            j.writeFieldName("greeting");
            j.writeString(u.greeting);
        }
        if (u.favoriteFruit != null) {
            j.writeFieldName("favoriteFruit");
            j.writeString(u.favoriteFruit);
        }
        j.writeEndObject();
    }

    @Override
    public org.json.simple.JSONObject jsonsimple(Users obj) throws IOException {
        org.json.simple.JSONObject jso = new org.json.simple.JSONObject();
        if (obj.users != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (User u : obj.users) {
                jsarr.add(jsonsimple(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.json.simple.JSONObject jsonsimple(User u) throws IOException {
        org.json.simple.JSONObject jso = new org.json.simple.JSONObject();
        if (u._id != null) {
            jso.put("_id", u._id);
        }
        jso.put("index", u.index);
        if (u.guid != null) {
            jso.put("guid", u.guid);
        }
        jso.put("isActive", u.isActive);
        if (u.balance != null) {
            jso.put("balance", u.balance);
        }
        if (u.picture != null) {
            jso.put("picture", u.picture);
        }
        jso.put("age", u.age);
        if (u.eyeColor != null) {
            jso.put("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.put("name", u.name);
        }
        if (u.gender != null) {
            jso.put("gender", u.gender);
        }
        if (u.company != null) {
            jso.put("company", u.company);
        }
        if (u.email != null) {
            jso.put("email", u.email);
        }
        if (u.phone != null) {
            jso.put("phone", u.phone);
        }
        if (u.address != null) {
            jso.put("address", u.address);
        }
        if (u.about != null) {
            jso.put("about", u.about);
        }
        if (u.registered != null) {
            jso.put("registered", u.registered);
        }
        jso.put("latitude", u.latitude);
        jso.put("longitude", u.longitude);
        if (u.tags != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            jsarr.addAll(u.tags);
            jso.put("tags", jsarr);
        }
        if (u.friends != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (Friend f : u.friends) {
                org.json.simple.JSONObject jso0 = new org.json.simple.JSONObject();
                jso0.put("id", f.id);
                jso0.put("name", f.name);
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.put("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.put("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public void nanojson(JsonAppendableWriter w, Users obj) throws IOException {
        JsonAppendableWriter cw = w.object();
        if (obj.users != null) {
            cw.array("users");
            for (User u : obj.users) {
                cw = nanojson(cw, u);
            }
            cw.end();
        }
        cw.end();
    }

    private JsonAppendableWriter nanojson(JsonAppendableWriter w, User u) throws IOException {
        JsonAppendableWriter cw = w.object();
        if (u._id != null) {
            cw.value("_id", u._id);
        }
        cw.value("index", u.index);
        if (u.guid != null) {
            cw.value("guid", u.guid);
        }
        cw.value("isActive", u.isActive);
        if (u.balance != null) {
            cw.value("balance", u.balance);
        }
        if (u.picture != null) {
            cw.value("picture", u.picture);
        }
        cw.value("age", u.age);
        if (u.eyeColor != null) {
            cw.value("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            cw.value("name", u.name);
        }
        if (u.gender != null) {
            cw.value("gender", u.gender);
        }
        if (u.company != null) {
            cw.value("company", u.company);
        }
        if (u.email != null) {
            cw.value("email", u.email);
        }
        if (u.phone != null) {
            cw.value("phone", u.phone);
        }
        if (u.address != null) {
            cw.value("address", u.address);
        }
        if (u.about != null) {
            cw.value("about", u.about);
        }
        if (u.registered != null) {
            cw.value("registered", u.registered);
        }
        cw.value("latitude", u.latitude);
        cw.value("longitude", u.longitude);
        if (u.tags != null) {
            cw.array("tags");
            for (String t : u.tags) {
                cw.value(t);
            }
            cw.end();
        }
        if (u.friends != null) {
            cw.array("friends");
            for (Friend f : u.friends) {
                cw.object();
                cw.value("id", f.id);
                cw.value("name", f.name);
                cw.end();
            }
            cw.end();
        }
        if (u.greeting != null) {
            cw.value("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            cw.value("favoriteFruit", u.favoriteFruit);
        }
        cw.end();
        return cw;
    }

    @Override
    public org.apache.tapestry5.json.JSONObject tapestry(Users obj) throws IOException {
        org.apache.tapestry5.json.JSONObject jso = new org.apache.tapestry5.json.JSONObject();
        if (obj.users != null) {
            org.apache.tapestry5.json.JSONArray jsarr = new org.apache.tapestry5.json.JSONArray();
            for (User u : obj.users) {
                jsarr.add(tapestry(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.apache.tapestry5.json.JSONObject tapestry(User u) throws IOException {
        org.apache.tapestry5.json.JSONObject jso = new org.apache.tapestry5.json.JSONObject();
        if (u._id != null) {
            jso.put("_id", u._id);
        }
        jso.put("index", u.index);
        if (u.guid != null) {
            jso.put("guid", u.guid);
        }
        jso.put("isActive", u.isActive);
        if (u.balance != null) {
            jso.put("balance", u.balance);
        }
        if (u.picture != null) {
            jso.put("picture", u.picture);
        }
        jso.put("age", u.age);
        if (u.eyeColor != null) {
            jso.put("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.put("name", u.name);
        }
        if (u.gender != null) {
            jso.put("gender", u.gender);
        }
        if (u.company != null) {
            jso.put("company", u.company);
        }
        if (u.email != null) {
            jso.put("email", u.email);
        }
        if (u.phone != null) {
            jso.put("phone", u.phone);
        }
        if (u.address != null) {
            jso.put("address", u.address);
        }
        if (u.about != null) {
            jso.put("about", u.about);
        }
        if (u.registered != null) {
            jso.put("registered", u.registered);
        }
        jso.put("latitude", u.latitude);
        jso.put("longitude", u.longitude);
        if (u.tags != null) {
            org.apache.tapestry5.json.JSONArray jsarr = new org.apache.tapestry5.json.JSONArray();
            jsarr.addAll(u.tags);
            jso.put("tags", jsarr);
        }
        if (u.friends != null) {
            org.apache.tapestry5.json.JSONArray jsarr = new org.apache.tapestry5.json.JSONArray();
            for (Friend f : u.friends) {
                org.apache.tapestry5.json.JSONObject jso0 = new org.apache.tapestry5.json.JSONObject();
                jso0.put("id", f.id);
                jso0.put("name", f.name);
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.put("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.put("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public com.eclipsesource.json.JsonValue minimaljson(Users obj) throws IOException {
        com.eclipsesource.json.JsonObject jso = com.eclipsesource.json.Json.object();
        if (obj.users != null) {
            com.eclipsesource.json.JsonArray jsarr = com.eclipsesource.json.Json.array();
            for (User u : obj.users) {
                jsarr.add(minimaljson(u));
            }
            jso.add("users", jsarr);
        }
        return jso;
    }

    private com.eclipsesource.json.JsonValue minimaljson(User u) throws IOException {
        com.eclipsesource.json.JsonObject jso = com.eclipsesource.json.Json.object();
        if (u._id != null) {
            jso.add("_id", u._id);
        }
        jso.add("index", u.index);
        if (u.guid != null) {
            jso.add("guid", u.guid);
        }
        jso.add("isActive", u.isActive);
        if (u.balance != null) {
            jso.add("balance", u.balance);
        }
        if (u.picture != null) {
            jso.add("picture", u.picture);
        }
        jso.add("age", u.age);
        if (u.eyeColor != null) {
            jso.add("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.add("name", u.name);
        }
        if (u.gender != null) {
            jso.add("gender", u.gender);
        }
        if (u.company != null) {
            jso.add("company", u.company);
        }
        if (u.email != null) {
            jso.add("email", u.email);
        }
        if (u.phone != null) {
            jso.add("phone", u.phone);
        }
        if (u.address != null) {
            jso.add("address", u.address);
        }
        if (u.about != null) {
            jso.add("about", u.about);
        }
        if (u.registered != null) {
            jso.add("registered", u.registered);
        }
        jso.add("latitude", u.latitude);
        jso.add("longitude", u.longitude);
        if (u.tags != null) {
            com.eclipsesource.json.JsonArray jsarr = com.eclipsesource.json.Json.array();
            for (String t : u.tags) {
                jsarr.add(t);
            }
            jso.add("tags", jsarr);
        }
        if (u.friends != null) {
            com.eclipsesource.json.JsonArray jsarr = com.eclipsesource.json.Json.array();
            for (Friend f : u.friends) {
                com.eclipsesource.json.JsonObject jso0 = com.eclipsesource.json.Json.object();
                jso0.add("id", f.id);
                jso0.add("name", f.name);
                jsarr.add(jso0);
            }
            jso.add("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.add("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.add("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public void moshi(com.squareup.moshi.JsonWriter writer, Users obj) throws IOException {
        writer.beginObject();

        if (obj.users != null) {
            writer.name("users");
            writer.beginArray();
            for (User user : obj.users) {
                moshiUser(writer, user);
            }
            writer.endArray();
        }

        writer.endObject();
    }

    private void moshiUser(com.squareup.moshi.JsonWriter writer, User user) throws IOException {
        writer.beginObject();

        if (user._id != null) {
            writer.name("_id");
            writer.value(user._id);
        }

        writer.name("index");
        writer.value(user.index);


        if (user.guid != null) {
            writer.name("guid");
            writer.value(user.guid);
        }

        writer.name("isActive");
        writer.value(user.isActive);

        if (user.balance != null) {
            writer.name("balance");
            writer.value(user.balance);
        }

        if (user.picture != null) {
            writer.name("picture");
            writer.value(user.picture);
        }

        writer.name("age");
        writer.value(user.age);

        if (user.eyeColor != null) {
            writer.name("eyeColor");
            writer.value(user.eyeColor);
        }

        if (user.name != null) {
            writer.name("name");
            writer.value(user.name);
        }

        if (user.gender != null) {
            writer.name("gender");
            writer.value(user.gender);
        }

        if (user.company != null) {
            writer.name("company");
            writer.value(user.company);
        }

        if (user.email != null) {
            writer.name("email");
            writer.value(user.email);
        }

        if (user.phone != null) {
            writer.name("phone");
            writer.value(user.phone);
        }

        if (user.address != null) {
            writer.name("address");
            writer.value(user.address);
        }

        if (user.about != null) {
            writer.name("about");
            writer.value(user.about);
        }

        if (user.registered != null) {
            writer.name("registered");
            writer.value(user.registered);
        }

        writer.name("latitude");
        writer.value(user.latitude);

        writer.name("longitude");
        writer.value(user.longitude);

        if (user.tags != null) {
            writer.name("tags");
            writer.beginArray();
            for (String tag : user.tags) {
                writer.value(tag);
            }
            writer.endArray();
        }

        if (user.friends != null) {
            writer.name("friends");
            writer.beginArray();
            for (Friend friend : user.friends) {
                moshiFriend(writer, friend);
            }
            writer.endArray();
        }

        if (user.greeting != null) {
            writer.name("greeting");
            writer.value(user.greeting);
        }

        if (user.favoriteFruit != null) {
            writer.name("favoriteFruit");
            writer.value(user.favoriteFruit);
        }

        writer.endObject();
    }

    private void moshiFriend(com.squareup.moshi.JsonWriter writer, Friend friend) throws IOException {
        writer.beginObject();

        if (friend.id != null) {
            writer.name("id");
            writer.value(friend.id);
        }

        if (friend.name != null) {
            writer.name("name");
            writer.value(friend.name);
        }

        writer.endObject();
    }

    @Override
    public mjson.Json mjson(Users obj) throws IOException {
        mjson.Json usersJson = mjson.Json.object();
        if (obj.users != null) {
            mjson.Json usersArr = mjson.Json.array();
            for (User u : obj.users) {
                usersArr.add(mjson(u));
            }
            usersJson.set("users", usersArr);
        }
        return usersJson;
    }

    private mjson.Json mjson(User user) throws IOException {
        mjson.Json userJson = mjson.Json.object();
        if (user._id != null) {
            userJson.set("_id", user._id);
        }
        userJson.set("index", user.index);
        if (user.guid != null) {
            userJson.set("guid", user.guid);
        }
        userJson.set("isActive", user.isActive);
        if (user.balance != null) {
            userJson.set("balance", user.balance);
        }
        if (user.picture != null) {
            userJson.set("picture", user.picture);
        }
        userJson.set("age", user.age);
        if (user.eyeColor != null) {
            userJson.set("eyeColor", user.eyeColor);
        }
        if (user.name != null) {
            userJson.set("name", user.name);
        }
        if (user.gender != null) {
            userJson.set("gender", user.gender);
        }
        if (user.company != null) {
            userJson.set("company", user.company);
        }
        if (user.email != null) {
            userJson.set("email", user.email);
        }
        if (user.phone != null) {
            userJson.set("phone", user.phone);
        }
        if (user.address != null) {
            userJson.set("address", user.address);
        }
        if (user.about != null) {
            userJson.set("about", user.about);
        }
        if (user.registered != null) {
            userJson.set("registered", user.registered);
        }
        userJson.set("latitude", user.latitude);
        userJson.set("longitude", user.longitude);
        if (user.tags != null) {
            mjson.Json tagsArr = mjson.Json.array();
            for (String tag : user.tags) {
                tagsArr.add(tag);
            }
            userJson.set("tags", tagsArr);
        }
        if (user.friends != null) {
            mjson.Json friendsArr = mjson.Json.array();
            for (Friend friend : user.friends) {
                mjson.Json friendJson = mjson.Json.object();
                friendJson.set("id", friend.id);
                friendJson.set("name", friend.name);
                friendsArr.add(friendJson);
            }
            userJson.set("friends", friendsArr);
        }
        if (user.greeting != null) {
            userJson.set("greeting", user.greeting);
        }
        if (user.favoriteFruit != null) {
            userJson.set("favoriteFruit", user.favoriteFruit);
        }
        return userJson;
    }

    @Override
    public String underscore_java(Users obj) throws IOException {
        Map<String, Object> jso = new LinkedHashMap<>();
        if (obj.users != null) {
            List<Object> jsarr = new ArrayList<>();
            for (User u : obj.users) {
                jsarr.add(underscore_java(u));
            }
            jso.put("users", jsarr);
        }
        return com.github.underscore.lodash.U.toJson(jso);
    }

    private Map<String, Object> underscore_java(User u) throws IOException {
        Map<String, Object> jso = new LinkedHashMap<>();
        if (u._id != null) {
            jso.put("_id", u._id);
        }
        jso.put("index", u.index);
        if (u.guid != null) {
            jso.put("guid", u.guid);
        }
        jso.put("isActive", u.isActive);
        if (u.balance != null) {
            jso.put("balance", u.balance);
        }
        if (u.picture != null) {
            jso.put("picture", u.picture);
        }
        jso.put("age", u.age);
        if (u.eyeColor != null) {
            jso.put("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.put("name", u.name);
        }
        if (u.gender != null) {
            jso.put("gender", u.gender);
        }
        if (u.company != null) {
            jso.put("company", u.company);
        }
        if (u.email != null) {
            jso.put("email", u.email);
        }
        if (u.phone != null) {
            jso.put("phone", u.phone);
        }
        if (u.address != null) {
            jso.put("address", u.address);
        }
        if (u.about != null) {
            jso.put("about", u.about);
        }
        if (u.registered != null) {
            jso.put("registered", u.registered);
        }
        jso.put("latitude", u.latitude);
        jso.put("longitude", u.longitude);
        if (u.tags != null) {
            List<Object> jsarr = new ArrayList<>();
            jsarr.addAll(u.tags);
            jso.put("tags", jsarr);
        }
        if (u.friends != null) {
            List<Object> jsarr = new ArrayList<>();
            for (Friend f : u.friends) {
                Map<String, Object> jso0 = new LinkedHashMap<>();
                jso0.put("id", f.id);
                jso0.put("name", f.name);
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.put("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.put("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public Value purejson(Users obj) {
        Map<Parser.Value, Parser.Value> map = new LinkedHashMap<>(obj.users.size());
        List<Value> arr = new ArrayList<>(obj.users.size());
        for (User u : obj.users) {
            arr.add(purejson(u));
        }
        map.put(Value.string("users"), Value.arr(arr));
        return Value.json(map);
    }

    private Parser.Value purejson(User u) {
        Map<Parser.Value, Parser.Value> map = new LinkedHashMap<>();

        if (u._id != null) {
            map.put(Value.string("_id"), Value.string(u._id));
        }
        map.put(Value.string("index"), Value.integer(u.index));
        if (u.guid != null) {
            map.put(Value.string("guid"), Value.string(u.guid));
        }
        map.put(Value.string("isActive"), Value.bool(u.isActive));
        if (u.balance != null) {
            map.put(Value.string("balance"), Value.string(u.balance));
        }
        if (u.picture != null) {
            map.put(Value.string("picture"), Value.string(u.picture));
        }
        map.put(Value.string("age"), Value.integer(u.age));
        if (u.eyeColor != null) {
            map.put(Value.string("eyeColor"), Value.string(u.eyeColor));
        }
        if (u.name != null) {
            map.put(Value.string("name"), Value.string(u.name));
        }
        if (u.gender != null) {
            map.put(Value.string("gender"), Value.string(u.gender));
        }
        if (u.company != null) {
            map.put(Value.string("company"), Value.string(u.company));
        }
        if (u.email != null) {
            map.put(Value.string("email"), Value.string(u.email));
        }
        if (u.phone != null) {
            map.put(Value.string("phone"), Value.string(u.phone));
        }
        if (u.address != null) {
            map.put(Value.string("address"), Value.string(u.address));
        }
        if (u.about != null) {
            map.put(Value.string("about"), Value.string(u.about));
        }
        if (u.registered != null) {
            map.put(Value.string("registered"), Value.string(u.registered));
        }
        map.put(Value.string("latitude"), Value.number(u.latitude));
        map.put(Value.string("longitude"), Value.number(u.longitude));
        if (u.tags != null) {
            List<Parser.Value> jsarr = new ArrayList<>(u.tags.size());
            for (String t : u.tags) {
                jsarr.add(Value.string(t));
            }
            map.put(Value.string("tags"), Value.arr(jsarr));
        }
        if (u.friends != null) {
            List<Value> jsarr = new ArrayList<>(u.friends.size());
            for (Friend f : u.friends) {
                Map<Value, Value> jso0 = new LinkedHashMap<>();
                jso0.put(Value.string("id"), Value.string(f.id));
                jso0.put(Value.string("name"), Value.string(f.name));
                jsarr.add(Value.json(jso0));
            }
            map.put(Value.string("friends"), Value.arr(jsarr));
        }
        if (u.greeting != null) {
            map.put(Value.string("greeting"), Value.string(u.greeting));
        }
        if (u.favoriteFruit != null) {
            map.put(Value.string("favoriteFruit"), Value.string(u.favoriteFruit));
        }
        return Parser.Value.json(map);
    }
}
