from django.urls import path
from .views import persons_new
from .views import persons_list
from .views import persons_update
from .views import persons_delete
from .views import persons_photo


urlpatterns = [
    path('list/', persons_list, name="persons_list"),
    path('new/', persons_new, name="persons_new"),
    path('update/<int:id>/', persons_update, name="persons_update"),
    path('delete/<int:id>/', persons_delete, name="persons_delete"),
    path('photo/<int:id>/', persons_photo, name="persons_photo"),
]