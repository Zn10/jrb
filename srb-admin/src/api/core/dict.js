import request from '@/utils/request'
export default{
    getDictListByParentId(parentId){
        return request({
            method:'get',
            url:`/admin/core/dict/getDictListByParentId/${parentId}`
        })
    }
}