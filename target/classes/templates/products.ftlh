<#import "blocks/template.ftlh" as t>
<@t.template user>
    <h1 style="text-align: center;color: #293f88">Product Search</h1>
    <hr>
    <form method="get" action="/">
        <div class="form-row">

            <div class="form-group col-md-10">
                <label for="searchWord">Ad Search</label>
                <input type="text" name="searchWord" <#if searchWord??>value="${searchWord}"</#if> class="form-control"
                       id="searchWord">
            </div>
            <button style="width: 100%" type="submit" class="btn btn-custom">Search</button>
        </div>
    </form>
    <hr>
    <div class="card-columns">
        <#list products as product>
            <div class="card text-white bg-pink my-3 product">
                <img src="/images/${product.previewImageId}"
                     class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">${product.title}</h5>
                    <p class="card-text">${product.price} €</p>
                    <p class="card-text">${product.description}</p>
                </div>
                <div class="card-footer">
                    ${product.city}
                </div>
            </div>
        <#else>
            <h1 style="text-align: center">Not found</h1>
        </#list>
    </div>
</@t.template>
