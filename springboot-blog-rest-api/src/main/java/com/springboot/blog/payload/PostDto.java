package com.springboot.blog.payload;


import com.springboot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@Data
public class PostDto {
    private long id;

    /* title not empty and null
        title should be at least 2 characters
     */

    @NotEmpty
    @Size(min = 2, message = "Required minimum length 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Required minimum length 10 characters")
    private String description;

    @NotEmpty
    private String content;

    private Set<CommentDto> commentSet;
}
