package org.movie.action;

import com.opensymphony.xwork2.ActionContext;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.movie.entity.Actor;
import org.movie.service.ActorService;
import org.movie.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.IOException;

/**
 * @author guowei
 *         修改时间： 2017/4/1.
 */
@Controller("actorAction")
@Scope("prototype")
public class ActorAction {
    @Autowired
    private ActorService actorService;

    private PageBean<Actor> pageBean;

    private String message;
    //表单文件,必须是一个File类型
    private File uploadFile;
    //上传的文件名,格式必须是File名称 + FileName
    private String uploadFileFileName;


    //查询演员列表
    public String findActorList(){
        pageBean.setList(actorService.findActorList(pageBean));
        return "success";
    }
    //新增演员
    public String saveActor(){
        return "success";
    }
    //上传演员封面
    public String filmUploadActorImg() throws IOException {
        String uploadPath = ServletActionContext.getServletContext().getRealPath("/files");
        if (uploadFile != null) {
            //根据文件名以及上传路径构建一个新的file对象
            File saveFile = new File(uploadPath, uploadFileFileName);
            //先判断上传的目录是否存在，如果不存在则创建出来
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            //使用文件复制执行上传
            FileUtils.copyFile(uploadFile,saveFile);
            System.out.println("1111111");
            ActionContext.getContext().getApplication().put("fileName",uploadFileFileName);
        }
        return "success";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public File getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getUploadFileFileName() {
        return uploadFileFileName;
    }

    public void setUploadFileFileName(String uploadFileFileName) {
        this.uploadFileFileName = uploadFileFileName;
    }

    public PageBean<Actor> getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean<Actor> pageBean) {
        this.pageBean = pageBean;
    }


}
